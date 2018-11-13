package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/shortest-completing-word/
/*
licensePlate will be a string with length in range [1, 7].
licensePlate will contain digits, spaces, or letters (uppercase or lowercase).
words will have a length in the range [10, 1000].
Every words[i] will consist of lowercase letters, and have length in range [1, 15].
 */
public class ShortestWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int []table = new int[26]; //a~z

        //어떤 character를 몇개나 가지고 있는지 계산.
        for (char c:licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                table[Character.toLowerCase(c) - 'a']++;
            }
        }

        String shortest = "";
        for (String word:words) {
            int [] checkTable = Arrays.copyOf(table, table.length);
            for (char c: word.toCharArray()) {
                if (checkTable[c - 'a'] > 0)
                    checkTable[c - 'a']--;
            }

            boolean match = true;
            for (int check : checkTable) {
                if (check != 0) {
                    match = false;
                    break;
                }
            }

            if (match) {
                if (shortest.isEmpty() || (shortest.length() > word.length())) {
                    shortest = word;
                }
            }
        }

        return shortest;
    }
}

