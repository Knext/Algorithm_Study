package leetCode.easy.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
//in-order로 순회하고, 두수의 차를 비교한다.
public class MinDiffBST {

    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        int lastVal = Integer.MAX_VALUE;
        int minVal = Integer.MAX_VALUE;
        while(!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                minVal = Math.min(minVal, Math.abs(lastVal - node.val));
                lastVal = node.val;
                node = node.right;
            }
        }

        return minVal;
    }
}
