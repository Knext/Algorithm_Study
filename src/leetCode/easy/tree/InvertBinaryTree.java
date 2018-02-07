package leetCode.easy.tree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/invert-binary-tree/description/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
//        return use_DFS(root);
        return use_Queue(root);
    }

    private TreeNode use_Queue(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            //swap left and right
            TreeNode tempNode = node.left;
            node.left = node.right;
            node.right = tempNode;

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return root;
    }

    private TreeNode use_DFS(TreeNode root) {
        if (root == null) return null;

        TreeNode invert = new TreeNode(root.val);

        invert.left = invertTree(root.right);
        invert.right = invertTree(root.left);

        return invert;

    }
}
