package leetCode.easy;

import java.util.*;

//https://leetcode.com/problems/contains-duplicate-ii/description/
//단순하게 푼다면 O(L*M*N)
//문제를 잘못 이해함. difference between i and j is at most k "k 보다 작거나 같다"
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }
}
