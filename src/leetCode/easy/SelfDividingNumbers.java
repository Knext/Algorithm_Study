package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/self-dividing-numbers/description/
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (Integer i = left; i <= right; i++) {
           if (i.toString().contains("0")) continue;

           boolean bDivisible = true;
           for (char ch : i.toString().toCharArray()) {
               if (i % numberConverter(ch) != 0) {
                   bDivisible = false;
                   break;
               }
           }

           if (bDivisible) result.add(i);
        }

        return result;
    }


    private int numberConverter(char ch) {
       int result = 0;
       switch(ch) {
           case '1': result = 1; break;
           case '2': result = 2; break;
           case '3': result = 3; break;
           case '4': result = 4; break;
           case '5': result = 5; break;
           case '6': result = 6; break;
           case '7': result = 7; break;
           case '8': result = 8; break;
           case '9': result = 9; break;
       }
       return result;
    }

    /* solution
    public boolean selfDividing(int n) {
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        }
        return true;
    }
    */
}
