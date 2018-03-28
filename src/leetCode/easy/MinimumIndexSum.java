package leetCode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
public class MinimumIndexSum {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> firstMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) { //O(N)
            firstMap.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int lastLeastIndexSum = list1.length + list2.length;
        for (int j = 0; j < list2.length; j++) { //O(N)
           if (firstMap.containsKey(list2[j])) {
               int index = firstMap.get(list2[j]) + j;
               if (index < lastLeastIndexSum) {
                   lastLeastIndexSum = index;
                   result.clear();
                   result.add(list2[j]);
               } else if (index == lastLeastIndexSum) {
                   result.add(list2[j]);
               }
           }
        }

        return result.toArray(new String[result.size()]);
    }
}
