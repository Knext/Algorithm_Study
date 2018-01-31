package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrimBinarySearchTreeTest {

    @Test
    public void test_trimBST() {
        TrimBinarySearchTree trimBST = new TrimBinarySearchTree();
//        assertThat(trimBST.trimBST(getSampleTree1(), 1,2), is(getSample_ResultTree_1()));
        assertThat(trimBST.trimBST(getSampleTree2(), 1,3), is(getSample_ResultTree_2()));
    }

    private TreeNode getSampleTree1() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new TreeNode(1));
        bst.insert(new TreeNode(2));
        bst.insert(new TreeNode(0));
        return bst.getRoot();
    }

    private TreeNode getSample_ResultTree_1() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new TreeNode(1));
        bst.insert(new TreeNode(2));
        return bst.getRoot();
    }

    private TreeNode getSampleTree2() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new TreeNode(3));
        bst.insert(new TreeNode(0));
        bst.insert(new TreeNode(4));
        bst.insert(new TreeNode(2));
        bst.insert(new TreeNode(1));
        return bst.getRoot();
    }

    private TreeNode getSample_ResultTree_2() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new TreeNode(3));
        bst.insert(new TreeNode(2));
        bst.insert(new TreeNode(1));
        return bst.getRoot();
    }
}