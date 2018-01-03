package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/array-partition-i/description/
// 순서대로 정렬을 하고 나면, 두개 짝 중 앞의 것이 취할 수 있는 최대값이다.
// 1, 3, 4, 2 -> 1,2,3,4 : 어떻게 해도 최소값의 합은 1 + 3 보다 커질 수 없다.
public class ArrayPartition1 {

    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums); //NlonN
        for(int i = 0; i < nums.length ; i+=2) { // N/2
            result += nums[i];
        }
        return result;
    }
}
