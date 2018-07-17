package leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/count-primes/description/
//소수는 소수로 나누면 나머지가 0이 아니다.
//에라스토네스의 체가 아니면 타임아웃...OTL...
public class CountPrimes {

    public int countPrimes(int n) {
        if (n <= 2) return 0;

        return countPrimes_erastones(n);
    }

    public int countPrimes_erastones(int n) {
        boolean []table = new boolean[n+1];
        Arrays.fill(table, true);

        for (int i = 2; i < n; i++) {
            if (table[i]) {
                //확인해야 하는 table
                int j = 2;
                while (j*i < n) {
                    //2,4,6,8,10 (i * 2,3,4,5)
                    table[j*i] = false;
                    j++;
                }
            }
        }

        int nPrime = 0;
        for (int i = 2; i < n; i++) {
            if (table[i]) nPrime++;
        }
        return nPrime;
    }

    public int countPrimes_timeout(int n) {
        int nPrimsPos = 0;
        int [] primes = new int[n/2];
        primes[nPrimsPos++] = 2;

        int i = 2;
        while(i < n) { //O(M*N)
            boolean isPrime = true;
            for (int pos = 0; pos < nPrimsPos; pos++) {
                if (i % primes[pos] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[nPrimsPos++] = i;
            }
            i++;
        }

        return nPrimsPos;
    }
}
