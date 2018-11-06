package leetCode.easy.dp;

import java.util.Arrays;

//https://leetcode.com/problems/house-robber/
public class HouseRobber {
    public int rob(int[] nums) {
        int maxVal = 0;
        if (nums == null || nums.length == 0) return maxVal;
        if (nums.length == 1) return nums[0];
        int [] cals = new int[nums.length];
        Arrays.fill(cals, 0);

        for (int i = 0; i < nums.length; i++) { //O(N*M)
            //현재까지의 최대값을 구한다.
            //INFO: 0, 1번째 index에 대한 처리를 놓치가 쉽다.
            //cals[]는 항상 이전값보다 크거나 같아야 한다.
            if (i == 0) {
                cals[i] = nums[i];
            } else if (i == 1) {
                cals[i] = Math.max(cals[i-1], nums[i]);
            } else {
                cals[i] = Math.max(cals[i-1], cals[i - 2] + nums[i]);
            }
        }

        return cals[nums.length-1];
    }
}
