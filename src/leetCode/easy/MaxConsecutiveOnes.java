package leetCode.easy;
//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNum = 0;
        int sequenceNum = 0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i] == 1) {
                sequenceNum++;
            } else {
                maxNum = Math.max(maxNum,sequenceNum);
                sequenceNum = 0;
            }
        }
        return Math.max(maxNum,sequenceNum);
    }
}
