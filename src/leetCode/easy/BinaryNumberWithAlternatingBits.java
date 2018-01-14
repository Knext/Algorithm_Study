package leetCode.easy;
//https://leetcode.com/problems/binary-number-with-alternating-bits/description/
//2로 나눈 나머지값이 이전/이후로 비교해서 다른 경우를 찾는다.
public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int remainder = n%2;
        n = n/2;
        while(n != 0) {
            //나누기
            if (remainder == n%2) {
                return false;
            } else {
                remainder = n%2;
            }
            n = n/2;
        }

        return true;
    }
}
