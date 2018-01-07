package leetCode.easy;
//https://leetcode.com/problems/reverse-string/description/

public class ReverseString {
    public String reverseString(String s) {
        StringBuffer stringBuffer = new StringBuffer(s.length());
        char[] strings = s.toCharArray();
        for (int i = s.length() -1; i >= 0; i--) {
           stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }
}
