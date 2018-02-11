package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ConvertBSTToGreaterTreeTest {

    @Test
    public void convertBST() {
        ConvertBSTToGreaterTree convTree = new ConvertBSTToGreaterTree();
        TreeNode treeNode = convTree.convertBST(getTestTree());
        assertThat(treeNode.val, is(getConvertedTree().val));
        assertThat(treeNode.left.val, is(getConvertedTree().left.val));
        assertThat(treeNode.right.val, is(getConvertedTree().right.val));
    }

    private TreeNode getTestTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        return root;
    }

    private TreeNode getConvertedTree() {
        TreeNode root = new TreeNode(18);
        root.left = new TreeNode(20);
        root.right = new TreeNode(13);
        return root;
    }
}