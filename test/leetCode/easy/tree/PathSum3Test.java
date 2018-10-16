package leetCode.easy.tree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class PathSum3Test {

    @Test
    void pathSum() {
        PathSum3 pathSum3 = new PathSum3();
        Assert.assertThat(pathSum3.pathSum(getTestTreenode(), 8), is(3));
    }

    private TreeNode getTestTreenode() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(3);
        root.left.left.right= new TreeNode(-2);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(1);
        root.right = new TreeNode(-3);
        root.right.right = new TreeNode(11);
        return root;
    }
}