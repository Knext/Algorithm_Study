package leetCode.easy.tree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/description/
//root보다 크면서 가장 작은 수를 찾는다.
//만약 없다면 -1 return
public class SecondMinimumNode {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;

        int secondMin = Integer.MAX_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val > root.val)
                secondMin = Math.min(secondMin, node.val);

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return secondMin == Integer.MAX_VALUE ? -1 : secondMin;
    }
}
