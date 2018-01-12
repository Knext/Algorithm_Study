package leetCode.easy;

import java.util.Arrays;
//https://leetcode.com/problems/next-greater-element-i/description/

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1Len = nums1.length;
        int n2Len = nums2.length;
        int []result = new int[n1Len];
        Arrays.fill(result, -1);

        for (int i = 0; i < n1Len; i++) {
            for (int j=0; j < n2Len; j++) {
                //위치를 찾고,
                if (nums1[i] == nums2[j]) {
                    //다음 큰 수를 찾는다.
                    while (j < n2Len) {
                        if (nums1[i] < nums2[j]) {
                            result[i] = nums2[j];
                            break;
                        }
                        j++;
                    }
                }
            }
        }
        return result;
    }
}

