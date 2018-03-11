package leetCode.easy;
//https://leetcode.com/problems/delete-node-in-a-linked-list/description/
//이건 문제가 잘못 만들어 진것 같음..--;;
public class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
