package leetCode.easy;
//https://leetcode.com/submissions/detail/145266376/
//sorting하고 비교하는 경우 O(NlogN) + O(N), hash table 이용하는 경우 O(N) + hashmap 공간
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) return false;

        Map<Integer, Integer> table = new HashMap<>();
        for (Integer num: nums){
            if (table.containsKey(num)) {
                return true;
            } else {
                table.put(num, 1);
            }
        }

        return false;
    }
}
