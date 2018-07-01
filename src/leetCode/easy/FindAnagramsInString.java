package leetCode.easy;

import java.util.*;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
public class FindAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || p == null || p.isEmpty()) return result;
        if (s.length() < p.length()) return result;

        int [] sTable = new int[26];
        int [] pTable = new int[26];
        Arrays.fill(pTable, 0);
        int pLen = p.length();

        //make pTable
        for (char c: p.toCharArray()) { //O(26)
            pTable[c - 'a']++;
        }

        for (int i = 0; i < s.length() - p.length() + 1; i++) { //O(26)
            if (i == 0) {
                //처음에는 문자열 갯수만큼 substring
                for (char c : s.substring(i, i + pLen).toCharArray()) { //O(N)
                    sTable[c - 'a']++;
                }
            } else {
                // 그 다음엔 윈도우처럼 이동.
                sTable[s.charAt(i-1) - 'a']--; //제외되는 문자는 s의 이전 문자열의 이전 위치...
                sTable[s.charAt(i + pLen - 1) - 'a']++; //추가되는 문자는 substring한 문자열의 마지막
            }

            if (isAnagram(sTable, pTable)) result.add(i); //O(N)
        }

        return result;
    }

    private boolean isAnagram(int [] sTable, int[] pTable) {
        for (int i = 0; i < sTable.length; i++) {
            if (sTable[i] != pTable[i]) {
                return false;
            }
        }
        return true;
    }
}
