package leetCode.easy;

import java.util.*;
//https://leetcode.com/problems/most-common-word/description/
// 어떤놈이 이상한 테스트 케이스를 추가해 놔서 한참을 고민함.
// discussion 찾아보니, 다들 이상한 case가 추가되었다고 ㄹㄹㄹ...
public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        String [] splits = paragraph.split(" ");
        Map<String, Integer> wordMap = new HashMap<>();
        int maxCnt = -1;
        String mostCommon = "";
        for (String split:splits) {
            split = split.toLowerCase();
            split = removePunc(split);
            if (!hasBanned(banned,split)) {
                int wordCnt = wordMap.getOrDefault(split, 0);
                wordMap.put(split, wordCnt+1);
                if (maxCnt < wordCnt) {
                   maxCnt = wordCnt;
                   mostCommon = split;
                }
            }
        }

        return mostCommon;
    }

    private String removePunc(String split) {
        StringBuffer strBuf = new StringBuffer();
        for (char ch:split.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                strBuf.append(ch);
            }
        }
        return strBuf.toString();
    }

    private boolean hasBanned(String [] banned, String word) {
        if (banned == null || banned.length == 0) return false;

        for (String ban:banned) {
            if (ban.equals(word))
                return true;
        }
        return false;
    }
}
