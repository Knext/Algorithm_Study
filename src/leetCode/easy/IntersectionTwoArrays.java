package leetCode.easy;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays/description/
public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        if (nums1 == null || nums2 == null) return new int[]{0};

        int num1Len = nums1.length;
        int num2Len = nums2.length;
        Arrays.sort(nums1); //O(nlogn)
        Arrays.sort(nums2); //O(mlogm)

        int i = 0;
        int j = 0;
        while (i < num1Len && j < num2Len) { //O(N)
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        i = 0;
        int [] result = new int[set.size()];
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) { //O(N)
            result[i++] = iter.next();
        }

        return result;
    }
}
