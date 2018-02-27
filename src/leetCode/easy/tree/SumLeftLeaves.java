package leetCode.easy.tree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/sum-of-left-leaves/description/
public class SumLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int leftSum = 0;
        if (root == null) return leftSum;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                //leaf node인 경우만 더해준다.
                if (node.left.left == null
                        && node.left.right == null)
                    leftSum += node.left.val;
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return leftSum;
    }
}
