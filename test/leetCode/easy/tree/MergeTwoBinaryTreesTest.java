package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeTwoBinaryTreesTest {

    @Test
    public void mergeTrees() {
        MergeTwoBinaryTrees mtbt = new MergeTwoBinaryTrees();
        assertThat(mtbt.mergeTrees(getTestTreenodeOne(), getTestTreenodeTwo()).val, is(getResultTreenode().val));
    }

    private TreeNode getTestTreenodeOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        return root;
    }

    private TreeNode getTestTreenodeTwo() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);
        return root;
    }

    private TreeNode getResultTreenode() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        return root;
    }
}