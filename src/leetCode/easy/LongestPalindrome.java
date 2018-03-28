package leetCode.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-palindrome/description/
// hashmap 이외에 hashset을 이용할 수도 있음
// char[] table을 이용하는 경우 속도가 더 빠름.(a-zA-Z)
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int result = 0;
        boolean hasOdd = false;
        for (Integer value : map.values()) {
            if (value % 2 == 0) {
                result += value;
            } else {
                hasOdd = true;
                result += value - 1;
            }
        }

        return result + (hasOdd ? 1 : 0);
    }
}
