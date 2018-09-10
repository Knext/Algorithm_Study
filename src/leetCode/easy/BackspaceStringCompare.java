package leetCode.easy;

import java.util.Stack;

/*
https://leetcode.com/problems/backspace-string-compare/description/
Note:
    1 <= S.length <= 200
    1 <= T.length <= 200
    S and T only contain lowercase letters and '#' characters.
Follow up:
    Can you solve it in O(N) time and O(1) space?
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        String s = getStringRemoveBackSpace(S);
        String t = getStringRemoveBackSpace(T);
        return s.equals(t);
    }

    private String getStringRemoveBackSpace(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        StringBuffer strBuffer = new StringBuffer();
        while(!stack.isEmpty())  {
            strBuffer.append(stack.pop());
        }
        return strBuffer.toString();
    }
}
