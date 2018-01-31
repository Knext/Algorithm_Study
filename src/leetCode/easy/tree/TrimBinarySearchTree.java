package leetCode.easy.tree;

import java.util.*;

//https://leetcode.com/problems/trim-a-binary-search-tree/description/
public class TrimBinarySearchTree {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        Queue<Integer> nodes = new ArrayDeque<>();
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        //모든 tree를 순회해서 범위내의 값을 찾는다.
        while(!que.isEmpty()) {
            TreeNode node = que.remove();
            if (node.val >= L && node.val <= R)
                nodes.add(node.val);

            if (node.left != null) que.add(node.left);
            if (node.right != null) que.add(node.right);
        }

        //새로운 Tree를 만들어서 남아있는 값을 추가한다.
        TreeNode newRoot = new TreeNode(nodes.remove());
        TreeNode node;
        while(!nodes.isEmpty()) {
            if (newRoot == null) {
                return null;
            } else {
                node = new TreeNode(nodes.remove());
                TreeNode prev = null;
                TreeNode cur = newRoot;
                //마지막 노드를 찾는다.
                while (cur != null) {
                    prev = cur;
                    if (cur.val <= node.val) {
                        cur = cur.right;
                    } else if (cur.val > node.val) {
                        cur = cur.left;
                    }
                }
                //마지막 노드 값과 비교해서 왼쪽/오른쪽에 추가.
                if (prev.val > node.val) {
                    prev.left = node;
                } else {
                    prev.right = node;
                }
            }
        }

        return newRoot;
    }

}
