package leetCode.easy.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SameTreeTest {

    @Test
    public void isSameTree() {
        SameTree sameTree = new SameTree();
        assertThat(sameTree.isSameTree(test1(), test1()), is(true));
        assertThat(sameTree.isSameTree(test1(), test2()), is(false));
        assertThat(sameTree.isSameTree(test2(), test3()), is(false));
    }

    private TreeNode test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        return root;
    }

    private TreeNode test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        return root;
    }

    private TreeNode test3() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        return root;
    }
}