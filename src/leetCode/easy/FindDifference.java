package leetCode.easy;

import java.util.Arrays;
//https://leetcode.com/problems/find-the-difference/description/

public class FindDifference {
    public char findTheDifference(String s, String t) {
        return findByXOR(s, t);
    }

    //O(N) + O(N), without extra space
    public char findByXOR(String s, String t) {
        char result = 0;
        for (char c_s:s.toCharArray()) { //O(N)
            result ^= c_s;
        }
        for (char c_t:t.toCharArray()) { //O(N)
            result ^= c_t;
        }

        return result;

    }

    //O(NlogN) + O(NlogN) + O(N), two extra char[] spaces
    public char findBySorting(String s, String t) {
        char[] org = s.toCharArray();
        char[] shuff = t.toCharArray();

        Arrays.sort(org); //O(NlogN)
        Arrays.sort(shuff);//O(NlogN)
        for (int i = 0; i<org.length; i++) { //O(N)
            if (org[i] != shuff[i]) return shuff[i];
        }

        return shuff[org.length];
    }
}
