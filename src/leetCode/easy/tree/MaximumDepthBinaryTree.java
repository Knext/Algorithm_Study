package leetCode.easy.tree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
//binary tree level을 물어보는 문제.
public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        int maxLevel = 0;
        if (root == null) return maxLevel;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            maxLevel++;
            int queSize = queue.size();
            for (int i = 0; i < queSize; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return maxLevel;
    }
}
