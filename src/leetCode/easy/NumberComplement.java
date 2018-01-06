package leetCode.easy;
//https://leetcode.com/problems/number-complement/description/

public class NumberComplement {
    public int findComplement(int num) {
        if (num == 0) return 1;

        int mask = 0;
        int value = num;
        //2를 나누어서 2이 될때까지 '1' mask를 왼쪽으로 옮긴다.
        while(value != 0) {
            value /= 2;
            mask = (mask << 1) + 1;
        }
        System.out.format("%d, %x\n",num, Integer.highestOneBit(num));

        //입력값의 보수에 대해 마스크 해서 값을 취한다.
        return ~num & mask;

    }
}
