package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/happy-number/description/
// 같은 숫자가 두번 나오면 실패로 본다.
public class HappyNumber {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        int sum = n;
        while (true) {
            sum = getSum(sum);
            if (sum == 1)
                return true;

            if (set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
            }
        }
    }

    private int getSum(int n) {
        double sum = 0;
        while ( n > 0)  {
            int remain = n % 10;
            n = n / 10;
            sum += Math.pow(remain, 2);
        }
        return (int)sum;
    }
}
