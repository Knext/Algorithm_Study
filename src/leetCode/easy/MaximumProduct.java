package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-product-of-three-numbers/description/
//1. 모든 수가 양수인 경우.
//2. 음수가 포함된 경우.
public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        int result = 0;
        Arrays.sort(nums); //O(NlogN)

        int len = nums.length;
        if (nums[0] > 0) {
            result = nums[len - 3] * nums[len - 2] * nums[len - 1];
        } else { //음수 포함된 경우
            if (nums[0] * nums[1] > 0) {
                result = Math.max(nums[0] * nums[1] * nums[len - 1], nums[len - 3] * nums[len - 2] * nums[len - 1]);
            } else {
                result = nums[len - 3] * nums[len - 2] * nums[len - 1];
            }
        }

        return result;
    }
}
