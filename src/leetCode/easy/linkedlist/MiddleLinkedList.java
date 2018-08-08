package leetCode.easy.linkedlist;

import leetCode.easy.ListNode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//https://leetcode.com/problems/middle-of-the-linked-list/description/
public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;

        ListNode cur = head;
        int listLen = 1;
        while (cur.next != null) {
            listLen++;
            cur = cur.next;
        }

        int mid = listLen/2 + 1;

        cur = head;
        listLen = 1;
        while (cur != null) {
            if (listLen == mid) {
                return cur;
            }
            listLen++;
            cur = cur.next;
        }

        return null;
    }
}
