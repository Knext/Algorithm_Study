package leetCode.easy.tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    private BinarySearchTree bst = new BinarySearchTree();

    @Before
    public void setup() {
        bst.insert(new TreeNode(4));
        bst.insert(new TreeNode(2));
        bst.insert(new TreeNode(3));
        bst.insert(new TreeNode(1));
        bst.insert(new TreeNode(6));
        bst.insert(new TreeNode(5));
        bst.insert(new TreeNode(7));
    }

    @After
    public void teardown() {
        bst = null;
    }

    @Test
    public void test_insert() {
        assertThat(bst.findMin().val, is(1));
        assertThat(bst.findMax().val, is(7));
    }

    @Test
    public void test_delete() {
        bst.delete(bst.search(1));
        assertThat(bst.findMin().val, is(2));

        bst.insert(new TreeNode(1));
        assertThat(bst.findMin().val, is(1));

        bst.insert(new TreeNode(8));
        assertThat(bst.findMax().val, is(8));

        bst.delete(bst.search(7));
        assertThat(bst.search(7), is(nullValue()));

        bst.delete(bst.search(4));
        assertThat(bst.search(4), is(nullValue()));

        bst.insert(new TreeNode(4));
    }

    @Test
    public void test_search() {
        assertThat(bst.search(2).val, is(2));
        assertThat(bst.search(8), is(nullValue()));
    }

    @Test
    public void test_findsuccessor() {
        assertThat(bst.findSuccessor(bst.search(3)).val, is(4));
        assertThat(bst.findSuccessor(bst.search(2)).val, is(3));
        assertThat(bst.findSuccessor(bst.search(4)).val, is(5));
    }
}