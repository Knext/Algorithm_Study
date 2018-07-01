package leetCode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/word-pattern/description/
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        //두개 길이는 같다.
        if (pattern.length() <= 1 && str.length() <= 1) return true;

        String[] values = str.split(" ");
        char[] pTable = pattern.toCharArray();

        if (values.length != pTable.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < values.length; i++) {
            if (map.containsKey(pTable[i])) {
                if (!map.get(pTable[i]).equals(values[i])) return false;
            } else {
                if (!set.contains(values[i])) {
                    set.add(values[i]);
                    map.put(pTable[i], values[i]);
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
