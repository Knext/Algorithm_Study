package leetCode.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        MergeTwoSortedLists merge = new MergeTwoSortedLists();
        assertThat(toIntArray(merge.mergeTwoLists(null, makeList(new int[]{1,2,4}))),
                is(toIntArray(makeList(new int[]{1,2,4}))));

        assertThat(toIntArray(merge.mergeTwoLists(makeList(new int[]{5,6,7}), makeList(new int[]{1,2,4}))),
                is(toIntArray(makeList(new int[]{1,2,4,5,6,7}))));

        assertThat(toIntArray(merge.mergeTwoLists(makeList(new int[]{1,2,3}), makeList(new int[]{1,4}))),
                is(toIntArray(makeList(new int[]{1,1,2,3,4}))));

    }


    private ListNode makeList(int [] values ) {
        if (values == null) return null;

        ListNode root = null;
        ListNode node = null;
        for (int value : values) {
            if (root == null) {
                node = new ListNode(value);
                root = node;
            } else {
               node.next = new ListNode(value);
               node = node.next;
            }
        }

        return root;
    }

    private int[] toIntArray(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        while(listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}