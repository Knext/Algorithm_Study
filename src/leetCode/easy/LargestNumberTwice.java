package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
//정렬해<O(NlogN)> 놓고 마지막 숫자가 그전 숫자보다 큰지만 확인하면 된다.
//정렬하지 않고, max를 먼저 찾고<O(N)>, 그리고 다시 비교해도 된다. <O(N)>
public class LargestNumberTwice {
    public int dominantIndex(int[] nums) {

        if (nums == null || nums.length == 0) return -1;
        if (nums.length == 1) return 0;

        //return sortAndCompare(nums);
        return linearScanAndCompare(nums);
    }

    private int linearScanAndCompare(int[] nums) {
        int maxIndex = 0;
        int max = 0;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i< nums.length; i++) {
            if (i != maxIndex && nums[i] * 2 > max) return -1;
        }

        return maxIndex;
    }

    private int sortAndCompare(int[] nums) {
        int[] table = Arrays.copyOf(nums, nums.length);
        Arrays.sort(table);

        if (table[table.length -2] * 2 <= table[table.length -1]) {
            for (int i = 0; i< nums.length; i++) {
               if(nums[i] == table[table.length -1]) return i;
            }
        }

        return -1;
    }
}
