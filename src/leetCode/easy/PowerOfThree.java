package leetCode.easy;
//https://leetcode.com/problems/power-of-three/
//Could you do it without using any loop / recursion?
//1도 3의 배수 3^0=1
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;

        while (true) {
            if (n%3 == 0) {
                if (n == 3) return true;
                n = n/3;
            } else {
                return false;
            }
        }
    }
}
