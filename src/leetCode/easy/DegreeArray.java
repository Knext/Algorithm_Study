package leetCode.easy;

import java.util.*;

//https://leetcode.com/problems/degree-of-an-array/description/
//nums.length will be between 1 and 50,000.
//nums[i] will be an integer between 0 and 49,999.
public class DegreeArray {

    public int findShortestSubArray(int[] nums) {
       return slowSoution(nums);
    }

    private int fastSolution(int[] nums) {
        //TODO:
        return 1;
    }

    private int slowSoution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        //create degree
        for (Integer num:nums) { //O(N)
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        //find max degrees, more than one.
        List<Integer> maxDegrees = new ArrayList<>();
        int max = 0;
        for (Integer key:map.keySet()) { //O(M)
            if (max == map.get(key)) {
                maxDegrees.add(key);
            } else if (max < map.get(key)) {
               max = map.get(key);
               maxDegrees.clear();
               maxDegrees.add(key);
            }
        }

        int minDistance = nums.length;
        for (Integer degree: maxDegrees) { //O(M*N)
            int start = -1;
            int end = -1;
            int cnt = 0;
            for (int i = 0; i < nums.length; i++)  {
                if (nums[i] == degree) {
                    if (start < 0) start = i;
                    if (end < i) end = i;
                    cnt++;
                    if (cnt == max) break;
                }
            }
            minDistance = Math.min(minDistance, end - start +1);
        }

        return minDistance;
    }
}
