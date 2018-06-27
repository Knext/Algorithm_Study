package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/description/
//nums start from 1 to n.
//The given array size will in the range [2, 10000].
//The given array's numbers won't have any order
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        //table start from 1.
        int [] table = new int[nums.length + 1];
        Arrays.fill(table, 0);
        table[0] = -1;

        //make set data, number is key.
        int dupKey = -1;
        for (int number : nums) { //O(N)
            table[number]++;
            if (table[number] == 2) {
                dupKey = number;
            }
        }
        int i = 1;
        int missingKey = -1;
        while (i < table.length) { //O(N)
            if (table[i] == 0) {
                missingKey = i;
                break;
            }
            i++;
        }

        return new int[]{dupKey, missingKey};
    }
}
