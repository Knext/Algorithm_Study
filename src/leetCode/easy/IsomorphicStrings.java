package leetCode.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/description/
public class IsomorphicStrings {
    //풀긴 풀었는데, 너무 오래 걸린다...
    //map에 push 하고,check하는게 너무 오래 걸리나?
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) { //O(N)
            if (map.containsKey(s.charAt(i))) {
                //key가 이미 다른 value와 mapping 되었는가?
                if (!map.get(s.charAt(i)).equals(t.charAt(i))) {
                   return false;
                }
            } else {
                // value가 이미 mapping 되었는가?
                if (map.containsValue(t.charAt(i))) {
                   return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}
