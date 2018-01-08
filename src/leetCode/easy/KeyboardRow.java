package leetCode.easy;
//https://leetcode.com/problems/keyboard-row/description/
//char[]를 이용해서 직접 계산 하는거랑 차이가 별로 없음.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class KeyboardRow {
    private HashSet<String> firstRowSet = new HashSet<>(
                Arrays.asList("q","w","e","r","t","y","u","i","o","p",
                        "Q","W","E","R","T","Y","U","I","O","P"));
    private HashSet<String> secondRowSet = new HashSet<>(
            Arrays.asList("a","s","d","f","g","h","j","k","l",
                    "A","S","D","F","G","H","J","K","L"));
    private HashSet<String> thirdRowSet = new HashSet<>(
            Arrays.asList("z","x","c","v","b","n","m",
                    "Z","X","C","V","B","N","M"));

    public String[] findWords(String[] words) {
        ArrayList<String> wordList = new ArrayList<>();
        for (String word: words) {
            if (checkSameRow(word)) {
                wordList.add(word);
            }
        }
        return wordList.toArray(new String[wordList.size()]);
    }

    private boolean checkSameRow(String word) {
        boolean first = true;
        boolean second = true;
        boolean third = true;
        for (char character: word.toCharArray()) {
            first &= firstRowSet.contains("" + character);
            second &= secondRowSet.contains("" + character);
            third &= thirdRowSet.contains("" + character);
        }
        if ((first && !second && !third)
                ||(!first && second && !third)
                ||(!first && !second && third)) {
            return true;
        }
        return false;
    }
}
