package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        ListNode reverse = null;
        ListNode reverseHead = null;
        for (int i = list.size() -1; i >= 0; i--) {
            if (reverse == null) {
                reverse = new ListNode(list.get(i));
                reverseHead = reverse;
            } else {
                reverse.next = new ListNode(list.get(i));
                reverse = reverse.next;
            }
        }

        return reverseHead;
    }

    //Iteration 방식(by official solution)
    public ListNode reverseListIter(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            //마법같은 일이 벌어지는데.....-_-;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    //recursive(by official solution)
    public ListNode reverseListRec(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
