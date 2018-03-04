package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/valid-anagram/description/
////https://leetcode.com/problems/ransom-note/description/ 동일한 문제.
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int [] table = new int[26];
        Arrays.fill(table, 0);

        for (int i = 0; i< s.length(); i++) { //O(N)
            table[s.charAt(i) - 'a']++;
            table[t.charAt(i)- 'a']--;
        }

        for (int i: table) { // O(N)
            if (i != 0) return false;
        }
        return true;
    }
}
