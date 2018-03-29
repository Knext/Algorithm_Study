package leetCode.easy;

import java.util.Arrays;
//https://leetcode.com/problems/missing-number/description/
//매우 쉬운 문제..
public class MissingNumber {
    public int missingNumber(int[] nums) {
        boolean [] result = new boolean[nums.length+1];
        Arrays.fill(result, false);

        for (int num: nums) {
            result[num] = true;
        }

        for (int i = 0; i < result.length; i++) {
            if (!result[i]) return i;
        }
        return 0;
    }
}
