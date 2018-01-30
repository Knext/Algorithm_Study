package leetCode.easy.tree;

import java.util.Stack;
//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
//O(N*h), extra stack space
public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        //BFS(너비 우선 탐색)
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) { //O(N)
            TreeNode node = stack.pop();
            int target = k - node.val;
            if (target != node.val) {
                if (search(root, target) != null) return true; //O(h)
            }

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return false;
    }

    private TreeNode search(TreeNode root, int val) {
        while (root != null) {
            if (root.val > val) {
                root = root.left;
            } else if (root.val < val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null; //cannot find.
    }
}
