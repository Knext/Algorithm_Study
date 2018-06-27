package leetCode.easy;

import java.util.Arrays;
//https://leetcode.com/problems/jewels-and-stones/description/
//ASCII code, A:65, Z:90, a:97, z:122
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int [] table = new int[58];
        Arrays.fill(table, 0);

        for (char ch : S.toCharArray()) {
           table[ch - 65]++;
        }

        int sum = 0;
        for (char ch : J.toCharArray()) {
           sum += table[ch -65];
        }

        return sum;
    }
}
