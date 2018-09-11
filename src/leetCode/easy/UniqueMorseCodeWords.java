package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/unique-morse-code-words/description/
public class UniqueMorseCodeWords {
    private String [] morses = {
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word: words) {
            char [] wordChars = word.toCharArray();
            StringBuffer strBuf = new StringBuffer();
            for (char c: wordChars) {
                strBuf.append(morses[c - 'a']);
            }
            set.add(strBuf.toString());
        }

        return set.size();
    }
}
