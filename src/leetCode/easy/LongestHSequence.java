package leetCode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//https://leetcode.com/problems/longest-harmonious-subsequence/description/
public class LongestHSequence {
    public int findLHS(int[] nums) {
        if (nums == null || nums.length < 2) return 0;

        return useSort(nums); //slow, it takes about 90ms
        //return useMap(nums); // still slow, it takes 90ms
    }


    private int useMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num:nums) { //O(N)
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;
        int prevVal = 0;
        int prevKey = 0;
        boolean isFirst = true;
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        Arrays.sort(keys);
        for (Integer key:keys) { //O(N)
            if (isFirst) {
                prevKey = key;
                prevVal = map.get(key);
                isFirst = false;
            } else {
               if (key - prevKey == 1) {
                   maxLen = Math.max(maxLen, prevVal + map.get(key));
               }
               prevKey = key;
               prevVal = map.get(key);
            }
        }

        return maxLen;
    }

    private int useSort(int[] nums) {
        Arrays.sort(nums); //O(NlogN)

        int maxLen = 0;
        int i = 0;
        while (i < nums.length) { //O(N*M)
            int length = 0;
            boolean hasDiffOne = false;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] - nums[i] == 0) {
                    length++;
                } else if (nums[j] - nums[i] == 1) {
                    hasDiffOne = true;
                    length++;
                } else {
                    break;
                }
            }
            if (hasDiffOne) maxLen = Math.max(maxLen, length);

            i++;
        }

        return maxLen;
    }
}
