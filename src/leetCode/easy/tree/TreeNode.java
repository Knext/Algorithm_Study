package leetCode.easy.tree;

public class TreeNode implements Comparable<TreeNode> {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        this.val = x;
        this.left = null;
        this.right = null;
    }

    @Override
    public int compareTo(TreeNode o) {
        return this.val > o.val ? 1 : -1;
    }
}
