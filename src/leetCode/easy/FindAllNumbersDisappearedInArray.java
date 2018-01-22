package leetCode.easy;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//O(N), no extra space without returned list space.
public class FindAllNumbersDisappearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
//        return useExtraSpace(nums);
        return notUseExtraSpace(nums);
    }
    //#2. not use extra space
    public List<Integer> notUseExtraSpace(int[] nums) {
        List<Integer> result = new ArrayList<>(); //returned list space.
        //확인된 index 자리는 negative로 바꾼다.
        for (int i = 0; i < nums.length; i++) { //O(N)
            int x = Math.abs(nums[i]);
            nums[x-1] = -Math.abs(nums[x-1]);
        }

        for (int i = 0 ; i < nums.length; i++) { //O(N)
            if (nums[i] >= 0) result.add(i+1);
        }

        return result;
    }

    //#1. use extra space
    public List<Integer> useExtraSpace(int[] nums) {
        List<Integer> result = new ArrayList<>(); //returned list space.
        int [] intArray = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) { //O(N)
            intArray[i] = i;
        }
        for (int i = 1; i <= nums.length; i++) { //O(N)
            intArray[nums[i-1]] = 0;
        }

        for (int i = 1; i <= nums.length; i++) { //O(N)
            if (intArray[i] != 0) result.add(i);
        }

        return result;
    }
}
