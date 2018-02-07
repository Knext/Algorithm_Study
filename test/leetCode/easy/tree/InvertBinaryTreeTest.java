package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InvertBinaryTreeTest {

    @Test
    public void invertTree() {
        InvertBinaryTree invertTree = new InvertBinaryTree();
        TreeNode inverted = invertTree.invertTree(getTestTreenodeOne());
        assertThat(inverted.right.right.val, is(getTestTreenodeOne().left.left.val));
        assertThat(inverted.left.left.val, is(getTestTreenodeOne().right.right.val));
    }

    private TreeNode getTestTreenodeOne() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        return root;
    }
}