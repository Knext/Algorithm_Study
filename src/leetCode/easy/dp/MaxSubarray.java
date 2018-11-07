package leetCode.easy.dp;
//https://leetcode.com/problems/maximum-subarray/
public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int []table = new int[nums.length];
        table[0] = nums[0];
        //최대값은 첫번째 index가 된다.
        int maxValue = table[0];

        for (int i = 1; i< nums.length; i++) {

            if ((nums[i] >= 0 && table[i-1] >= 0)
                    || (nums[i] < 0 && table[i-1] >= 0) ) {
                //이전까지의 최대 값과 현재 값을 더해주는 경우
                table[i] = table[i-1] + nums[i];
            } else if ((nums[i] >= 0 && table[i-1] < 0)
                    || (nums[i] < 0 && table[i-1] < 0) ){
                //이전까지의 값과 현재 값중에 최대값을 취하는 경우
                table[i] = Math.max(table[i-1], nums[i]);
            }

            maxValue = Math.max(maxValue, table[i]);
        }

        return maxValue;
    }
}
