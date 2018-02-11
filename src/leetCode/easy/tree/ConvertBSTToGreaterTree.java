package leetCode.easy.tree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/submissions/detail/140421820/
//recursion을 두번 했더니, 너무 느리다. 1100ms... accepted 되지만.. 개선이 필요함.
//전체 값을 array로 미리 계산 했더니. 120ms... accepted 되지만.. 개선이 필요함.
public class ConvertBSTToGreaterTree {
    private List<Integer> values = new ArrayList<>();
    public TreeNode convertBST(TreeNode root) {
        makeAllValues(root);
        return convertBSTInner(root);
    }

    private TreeNode convertBSTInner(TreeNode root) {
        if (root == null) return null;
        TreeNode convRoot = new TreeNode(root.val + getBiggerValues(root.val));

        convRoot.left = convertBSTInner(root.left);
        convRoot.right = convertBSTInner(root.right);

        return convRoot;
    }

    private int getBiggerValues(int val) {
        int totalSum = 0;
        for (int value: this.values) {
            if (value > val)
                totalSum += value;
        }
        return totalSum;
    }

    private void makeAllValues(TreeNode root) {
        if (root == null) return;

        //search pre-order
        values.add(root.val);
        makeAllValues(root.left);
        makeAllValues(root.right);
    }
}
