package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ReverseLinkedList reverse = new ReverseLinkedList();

        assertThat(reverse.reverseList(getTest1()).val, is(3));
        assertThat(reverse.reverseList(getTest2()).val, is(2));
    }

    ListNode getTest1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        return head;
    }

    ListNode getTest2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        return head;
    }
}