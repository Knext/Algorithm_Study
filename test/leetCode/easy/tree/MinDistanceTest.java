package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinDistanceTest {

    @Test
    public void minDiffInBST() {
        MinDistance minDistance = new MinDistance();
        assertThat(minDistance.minDiffInBST(getFirst()), is(1));
        assertThat(minDistance.minDiffInBST(getSecond()), is(6));
    }

    private TreeNode getFirst() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        return root;
    }

    private TreeNode getSecond() {
        TreeNode root = new TreeNode(27);
        root.right = new TreeNode(34);
        root.right.right = new TreeNode(58);
        root.right.right.left = new TreeNode(50);
        root.right.right.left.left = new TreeNode(44);
        return root;
    }
}