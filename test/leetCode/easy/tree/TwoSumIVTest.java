package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TwoSumIVTest {

    @Test
    public void findTarget() {
        TwoSumIV twoSumIV = new TwoSumIV();
        assertThat(twoSumIV.findTarget(getTestNode(), 9), is(true));
        assertThat(twoSumIV.findTarget(getTestNode(), 28), is(false));
        assertThat(twoSumIV.findTarget(new TreeNode(1), 2), is(false));
        assertThat(twoSumIV.findTarget(getTestNode2(), 4), is(true));
    }

    private TreeNode getTestNode() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new TreeNode(5));
        bst.insert(new TreeNode(3));
        bst.insert(new TreeNode(6));
        bst.insert(new TreeNode(2));
        bst.insert(new TreeNode(4));
        bst.insert(new TreeNode(7));

        return bst.getRoot();
    }

    private TreeNode getTestNode2() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new TreeNode(2));
        bst.insert(new TreeNode(1));
        bst.insert(new TreeNode(3));

        return bst.getRoot();
    }
}