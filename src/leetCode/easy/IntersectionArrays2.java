package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
//ArraysList, Stream을 썼을 땐 80ms였는데, int[] 로 바꿔서 처리하니 3ms의 기적이..(이렇게 다른가?)
public class IntersectionArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int [] result = new int[nums1.length >= nums2.length ? nums2.length: nums1.length];

        int n1Pos = 0;
        int n2Pos = 0;
        int rPos = 0;
        while( n1Pos < nums1.length && n2Pos < nums2.length) {
           if (nums1[n1Pos] > nums2[n2Pos])  {
               n2Pos++;
           } else if (nums1[n1Pos] < nums2[n2Pos]) {
               n1Pos++;
           } else {
               result[rPos++] = nums1[n1Pos];
               n1Pos++;
               n2Pos++;
           }
        }
        return Arrays.copyOf(result, rPos);
    }
}
