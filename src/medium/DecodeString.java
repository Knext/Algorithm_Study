package medium;

import java.util.Stack;

//https://leetcode.com/problems/decode-string/description/
public class DecodeString {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> digitStack = new Stack<>();

        String resource = "";
        int pos = 0;
        while (pos < s.length()) {
            if (Character.isDigit(s.charAt(pos))) { // check digit?
                String numStr = "";
                while (true) {
                    if (Character.isDigit(s.charAt(pos))) {
                        numStr += s.charAt(pos);
                        pos++;
                    } else {
                        pos--;
                        break;
                    }
                }
                digitStack.push(Integer.parseInt(numStr));
            } else if (s.charAt(pos) == '[') { //push to stack
                strStack.push(resource);
                resource = "";
            } else if (s.charAt(pos) == ']') { //pop from stack
                StringBuffer strBuffer = new StringBuffer(strStack.pop());
                int multiply = digitStack.pop();
                while (multiply > 0) {
                    multiply--;
                    strBuffer.append(resource);
                }
                resource = strBuffer.toString();
            } else {
                resource += s.charAt(pos);
            }
            pos++;
        }
        return resource;
    }
}
