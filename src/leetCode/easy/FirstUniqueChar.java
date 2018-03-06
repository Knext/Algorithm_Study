package leetCode.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/first-unique-character-in-a-string/description/
// 문자열이 영어 소문자라는 보장이 있으면, table[26]로 간단히 해결 가능하지만,
// 문제에 그런 보장이 없기 때문에 hash table 이용.
// 다른 사람들 풀이를 보니, 영어 소문자로 가정하고 풀어서 통과하네(9ms?) --? (나만 150ms...)
public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> table = new HashMap<>();
        for (char c: s.toCharArray()) { //O(N)
            if (table.containsKey(c)) {
                table.put(c, table.get(c) + 1);
            } else {
                table.put(c, 1);
            }
        }
        int i = 0;
        for (; i <s.length(); i++) { //O(N)
            if (table.containsKey(s.charAt(i)) && table.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
