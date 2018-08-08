package leetCode.easy.linkedlist;

import leetCode.easy.ListNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class MiddleLinkedListTest {

    @Test
    void middleNode() {
        MiddleLinkedList middle = new MiddleLinkedList();

        ListNode testNode3 = makeTestNode(new int[]{1});
        Assert.assertThat(middle.middleNode(testNode3).val, is(1));

        ListNode testNode1 = makeTestNode(new int[]{1,2,3,4,5,6});
        Assert.assertThat(middle.middleNode(testNode1).val, is(4));

        ListNode testNode2 = makeTestNode(new int[]{1,2,3,4,5});
        Assert.assertThat(middle.middleNode(testNode2).val, is(3));


    }

    private ListNode makeTestNode(int[] values) {
        if (values == null) return null;

        ListNode node = new ListNode(values[0]);
        ListNode cur = node;
        for (int i = 1; i < values.length; i++) {
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        return cur;
    }
}