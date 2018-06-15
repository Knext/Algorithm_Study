package leetCode.easy;

import java.util.*;

//https://leetcode.com/problems/longest-word-in-dictionary/description/
// 찾은 문자열의 길이가 같다면, 사전 순서상 먼저 나오는 것을 답으로 한다.
// 문제를 제대로 이해 못해서 한참 헤맴.
// 단어를 처음 부터 나눠서 분리 했을 때 모든 조합이 주어진 배열에 포함되는 가장 긴 문자를 찾는 문제
// ex> apple, apply -> 답: apple
//https://leetcode.com/problems/longest-word-in-dictionary/discuss/109114/JavaC++-Clean-Code
public class LongestWordInDict {
    public String longestWord(String[] words) {
        if (words.length == 0 || words == null) return "";
        if (words.length == 1) return words[0];

        Set<String> wordSet = new HashSet<>(Arrays.asList(words));

        String result = "";
        for (String word: words) { // O(N) * O(M)
            if (word.length() < result.length()) continue;

            for (int i = 1; i <= word.length(); i++) {
                String sub = word.substring(0, i);
                if (wordSet.contains(sub)) {
                    if (sub.length() > result.length()) {
                        result = sub;
                    } else if (sub.length() == result.length()) {
                        result = sub.compareTo(result) > 0 ? result : sub;
                    }
                } else {
                    break;
                }
            }
        }

        return result;
    }
}
