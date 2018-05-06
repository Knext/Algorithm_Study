package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SecondMinimumNodeTest {

    @Test
    public void findSecondMinimumValue() {
        SecondMinimumNode secondMinimumNode = new SecondMinimumNode();
        assertThat(secondMinimumNode.findSecondMinimumValue(test1()), is(5));
        assertThat(secondMinimumNode.findSecondMinimumValue(test2()), is(-1));
    }

    private TreeNode test1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        return root;
    }

    private TreeNode test2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        return root;
    }

}