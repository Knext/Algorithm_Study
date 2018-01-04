package leetCode.easy;
//https://leetcode.com/problems/reverse-integer/description/
public class ReverseInteger {
    public int reverse(int x) {
//        return reverseByStringConversion(x);
        return anotherSolution(x);
    }

    //이게 더 간단함.
    private int anotherSolution(int x) {
        double reverseNumber = 0;
        while ( x != 0)  {
            reverseNumber = (x % 10) + reverseNumber * 10;
            x /= 10;

            if (reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE ) return 0;

        }

        return (int)reverseNumber;
    }

    //동작은 하는데 별로...
    private int reverseByStringConversion(int x) {
        boolean positive = true;
        if (x < 0) {
            x *= -1;
            positive = false;
        }

        StringBuffer stringBuffer = new StringBuffer();
        String number = "" + x;

        char[] numbers = number.toCharArray();
        for (int i = number.length() -1; i >= 0; i--)
            stringBuffer.append(numbers[i]);

        String reverseNumber = stringBuffer.toString();
        int reverse = 0 ;
        try {
            reverse = Integer.parseInt(reverseNumber);
            reverse = positive ? reverse : reverse * -1;
        } catch (NumberFormatException ne) {
           //stackoverflow '0'
        }

        return reverse;
    }
}
