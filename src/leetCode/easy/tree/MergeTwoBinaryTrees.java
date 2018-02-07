package leetCode.easy.tree;

//https://leetcode.com/problems/merge-two-binary-trees/description/
//Use recursion!!!!!
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) return null;

        int val = (t1 != null ? t1.val : 0) + (t2 != null ? t2.val : 0);
        TreeNode root = new TreeNode(val);

        root.left = mergeTrees(t1 != null ? t1.left : null, t2 != null ? t2.left : null);
        root.right = mergeTrees(t1 != null ? t1.right : null, t2 != null ? t2.right : null);

        return root;
    }
}



