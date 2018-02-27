package leetCode.easy.tree;

import leetCode.easy.SumOfTwoIntegers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SumLeftLeavesTest {

    @Test
    public void sumOfLeftLeaves() {
        SumLeftLeaves sumLeft = new SumLeftLeaves();
        assertThat(sumLeft.sumOfLeftLeaves(testTree1()), is(5));
        assertThat(sumLeft.sumOfLeftLeaves(testTree2()), is(0));
        assertThat(sumLeft.sumOfLeftLeaves(testTree3()), is(5));
        assertThat(sumLeft.sumOfLeftLeaves(testTree4()), is(9));
    }

    private TreeNode testTree1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        return root;
    }

    private TreeNode testTree2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);
        return root;
    }

    private TreeNode testTree3() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        return root;
    }

    private TreeNode testTree4() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        return root;
    }
}