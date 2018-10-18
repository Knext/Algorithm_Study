package leetCode.easy.linkedlist;

import leetCode.easy.ListNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateListTest {

    @Test
    void deleteDuplicates() {
        RemoveDuplicateList removeList = new RemoveDuplicateList();
        Assert.assertThat(removeList.deleteDuplicates(makeList(new int[]{1,1,2})), is(makeList(new int[]{1,2})));
        Assert.assertThat(removeList.deleteDuplicates(makeList(new int[]{1,1,1,1,2})), is(makeList(new int[]{1,2})));
        Assert.assertThat(removeList.deleteDuplicates(makeList(new int[]{1,2,2,3,3})), is(makeList(new int[]{1,2,3})));
    }

    private ListNode makeList(int [] values) {
        ListNode head = null;
        ListNode node = null;
        for (int value: values) {
            if (head == null) {
                node = new ListNode(value);
                head = node;
            } else if (node.next == null) {
                node.next = new ListNode(value);
                node = node.next;
            }
        }
        return head;
    }

    private void printNodeValue(ListNode node) {
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}