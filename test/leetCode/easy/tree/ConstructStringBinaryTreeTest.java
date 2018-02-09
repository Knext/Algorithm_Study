package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ConstructStringBinaryTreeTest {

    @Test
    public void tree2str() {
        ConstructStringBinaryTree tree = new ConstructStringBinaryTree();
        assertThat(tree.tree2str(getTestTreenodeOne()), is("1(2(4))(3)"));
        assertThat(tree.tree2str(getTestTreenodeTwo()), is("1(2()(4))(3)"));
    }

    private TreeNode getTestTreenodeOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        return root;
    }

    private TreeNode getTestTreenodeTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        return root;
    }
}