package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumDepthBinaryTreeTest {

    @Test
    public void maxDepth() {
        MaximumDepthBinaryTree maxTree = new MaximumDepthBinaryTree();
        assertThat(maxTree.maxDepth(getTestTreenodeOne()), is(3));
        assertThat(maxTree.maxDepth(getTestTreenodeTwo()), is(4));
    }

    private TreeNode getTestTreenodeOne() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }

    private TreeNode getTestTreenodeTwo() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.left.right = new TreeNode(6);
        root.right.right = new TreeNode(-1);
        root.right.right.right = new TreeNode(8);
        return root;
    }
}