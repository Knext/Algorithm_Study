package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
//가장 큰 수 부터 시작해서, 가장 작은 수와 뺀 모든 합을 더한다.
public class MinimumMoves {
    public int minMoves(int[] nums) {

        int nMoves = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            nMoves += nums[i] - nums[0];
        }

        return nMoves;
    }
}
