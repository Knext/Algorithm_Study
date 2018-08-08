package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
// O(N) + O(N) 연산으로 수행하면, timeout limit에 걸림.
// 어쩔 수 없이, while loop에서 앞/뒤 포지션을 이용해서 처리함.
public class ReverseVowels {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return "";

        Set<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');

        int start = 0;
        int end = s.length() -1;
        char [] str = s.toCharArray();
        boolean startV = false;
        boolean endV = false;
        while (start < end) {
            if (vowelSet.contains(str[start])) {
               startV = true;
            } else if (!startV){
                start++;
            }
            if (vowelSet.contains(str[end])) {
                endV = true;
            } else if (!endV) {
                end--;
            }

            if (startV & endV) {
                //swap.
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                startV = false;
                endV = false;
                start++;
                end--;
            }
        }

        return new String(str);
    }
}
