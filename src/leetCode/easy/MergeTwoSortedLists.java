package leetCode.easy;
//https://leetcode.com/problems/merge-two-sorted-lists/description/
//두개의 정렬된 리스트값을 비교해서 하나로 합친다.
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }

        if (l1 == null)  cur.next = l2;
        else if (l2 == null) cur.next = l1;

        return head.next;
    }
}
