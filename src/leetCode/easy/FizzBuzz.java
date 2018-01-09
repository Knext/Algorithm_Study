package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/description/
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i<= n; i++ ) {
            boolean fizz = (i % 3) == 0;
            boolean buzz = (i % 5) == 0;

            if (fizz && buzz) {
                result.add("FizzBuzz") ;
            } else if (fizz) {
                result.add("Fizz");
            } else if (buzz) {
                result.add("Buzz") ;
            } else {
                result.add("" + i);
            }
        }

        return result;
    }
}
