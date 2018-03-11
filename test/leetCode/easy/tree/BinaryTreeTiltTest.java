package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinaryTreeTiltTest {

    @Test
    public void findTilt() {
        BinaryTreeTilt binaryTreeTilt = new BinaryTreeTilt();
        assertThat(binaryTreeTilt.findTilt(getTestTreenodeOne()), is(1));
        assertThat(binaryTreeTilt.findTilt(getTestTreenodeTwo()), is(15));
        assertThat(binaryTreeTilt.findTilt(getTestTreenodeThree()), is(11));
    }

    private TreeNode getTestTreenodeOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        return root;
    }

    private TreeNode getTestTreenodeTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        return root;
    }

    private TreeNode getTestTreenodeThree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        return root;
    }
}