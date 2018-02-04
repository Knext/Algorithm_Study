package leetCode.easy.tree;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AverageLevelsBinaryTreeTest {

    @Test
    public void test_averageOfLevels() {
        AverageLevelsBinaryTree averageTree = new AverageLevelsBinaryTree();

        assertThat(averageTree.averageOfLevels(getTestTreenodeOne()), is(Arrays.asList(3.0, 14.5, 11.0)));
    }

    private TreeNode getTestTreenodeOne() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }

}