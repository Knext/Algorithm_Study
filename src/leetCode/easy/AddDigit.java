package leetCode.easy;
//https://leetcode.com/problems/add-digits/description/
// 10을 9로 나누면 /10 + %10 과 동일한 결과를 얻을 수 있다.(약간의 예외를 추가해주면..^^;)
public class AddDigit {
    //O(1)
    public int addDigits(int num) {
        if (num == 0) return num;

        num %= 9;
        return (num == 0) ? 9 : num;
    }

    /* O(N)
    public int addDigits(int num) {
        int a = 0;
        int b = 0;
        int sum = num;
        while (sum >= 10) {
            a = sum /10;
            b = sum %10;
            sum = a+b;
        }
        return sum;
    }
    */
}
