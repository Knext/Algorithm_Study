package leetCode.easy;
//https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
public class LongestSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 0) return 0;
        if (nums.length == 1) return 1;

        int maxCnt = 1;
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            } else {
               cnt = 1;
            }
        }
        return maxCnt;
    }
}
