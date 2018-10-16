package leetCode.easy.tree;

import leetCode.easy.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/path-sum-iii/
public class PathSum3 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;

        TreeNode bufRoot = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(bufRoot);
        int cnt = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
            //Check Path Sum for node , DFS
            //checkSum()
            cnt += checkSum(node,0, sum);
        }
        return cnt;
    }

    private int checkSum(TreeNode node, int preValue, int targetSum) {
        int cnt = 0;
        if (node == null) return cnt;
        preValue = preValue + node.val;
        if (preValue == targetSum) cnt++;

        cnt += checkSum(node.left, preValue, targetSum);
        cnt += checkSum(node.right,preValue, targetSum);

        return cnt;
    }
}
