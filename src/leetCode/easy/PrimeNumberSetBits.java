package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/
//bit 연산, int bit는 32bit 이므로 prime number는 32까지만 미리 계산해 놓는다.

public class PrimeNumberSetBits {
    public int countPrimeSetBits(int L, int R) { //inclusive
        int totalCnt = 0;
        Set<Integer> primeSet = findPrimeNumber(32);
        for (int i = L; i <=R; i++) {
            if (primeSet.contains(countOneBitNum(i))) totalCnt++;
        }
        return totalCnt;
    }

    public int countOneBitNum(int number) {
        //bit count를 사용하자. one bit 개수를 알려줌.
        return Integer.bitCount(number);
//        int cnt = 0;
//        while(number != 0) {
//            if (number % 2 == 1) cnt++;
//            number /=2;
//        }
//        return cnt;
    }

    public Set<Integer> findPrimeNumber(int n) {
        //보다 빠르게 계산 하려면, prime number를 손으로 계산해서 if 문으로 모두 만들어 주면 됨.
        Set<Integer> primeSet = new HashSet<>();
        primeSet.add(2);
        primeSet.add(3);
        for (int i = 4; i <=n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < n; j++) {
                if (i % j == 0 && i != j) {
                    isPrime = false;
                    break;
                } else if (i == j) {
                    break;
                }
            }
            if (isPrime) primeSet.add(i);
        }
        return primeSet;
    }
}
