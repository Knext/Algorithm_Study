package leetCode.easy.tree;

import java.util.*;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
public class AverageLevelsBinaryTree {
//    private double values[] = new double[100];
//    private double numbers[] = new double[100];
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;
        //visitNext(root, 1);

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        double levelSum = 0;
        while(!queue.isEmpty()) {
            int levelNum = queue.size();
            for (int i = 0; i< levelNum; i++) {
                TreeNode node = queue.remove();
                levelSum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(levelSum/levelNum);
            levelSum = 0;
        }

        return result;
    }

    /*
    private void visitNext(TreeNode node, int level) {
        if (node == null) return;
        values[level] += node.val;
        numbers[level] += 1;

        visitNext(node.left, level + 1);
        visitNext(node.right, level + 1);
    }
    */
}
