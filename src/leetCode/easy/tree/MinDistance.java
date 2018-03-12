package leetCode.easy.tree;

import java.util.*;

//https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/
//정렬하고(inorder search), 각각의 min 값을 비교한다.
public class MinDistance {

    public int minDiffInBST(TreeNode root) {

        if (root == null) return 0;

        int minDistance = Integer.MAX_VALUE;

        List<Integer> valueList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                valueList.add(node.val);
                node = node.right;
            }
        }

        int prev = valueList.get(0);
        for (int i = 1; i < valueList.size(); i++) {
            minDistance = Math.min(minDistance, valueList.get(i) - prev);
            prev = valueList.get(i);
        }

        return minDistance;
    }
}
