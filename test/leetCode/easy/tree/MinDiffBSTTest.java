package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinDiffBSTTest {

    @Test
    public void getMinimumDifference() {
        MinDiffBST minDiffBST = new MinDiffBST();
        assertThat(minDiffBST.getMinimumDifference(testTree1()), is(3));
        assertThat(minDiffBST.getMinimumDifference(testTree2()), is(1));
        assertThat(minDiffBST.getMinimumDifference(testTree3()), is(1));
        assertThat(minDiffBST.getMinimumDifference(testTree4()), is(9));

    }

    private TreeNode testTree1() {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        return root;
    }

    private TreeNode testTree2() {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        return root;
    }

    private TreeNode testTree3() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(2);
        return root;
    }

    private TreeNode testTree4() {
        TreeNode root = new TreeNode(236);
        root.left = new TreeNode(104);
        root.right = new TreeNode(701);
        root.left.right = new TreeNode(227);
        root.right.right = new TreeNode(911);
        return root;
    }
}