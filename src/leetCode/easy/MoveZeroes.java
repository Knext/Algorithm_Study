package leetCode.easy;
//https://leetcode.com/problems/move-zeroes/description/
//1.You must do this in-place without making a copy of the array.
//2.Minimize the total number of operations.
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCnt++;
            } else {
                //'0'위치와 숫자의 위치를 바꾼다.
                int buf = nums[i - zeroCnt];
                nums[i - zeroCnt] = nums[i];
                nums[i] = buf;
            }
        }
    }
}
