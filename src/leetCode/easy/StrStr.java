package leetCode.easy;
//Implement strStr()
//https://leetcode.com/problems/implement-strstr/
//KMP solution을 이용하면 O(N)에 풀수 있다고 함..(찾아볼것)
public class StrStr {
    public int strStr(String haystack, String needle) {
        int pos = -1;
        if (needle == null || needle.length() == 0)
            return 0;

        int i = 0, j = 0;

        while(i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                pos = i;
                i++;
                j++;
            } else {
                i = i - j +1;
                j=0;
                pos = -1;
            }
        }

        if (j != needle.length()) return -1;

        if (pos > 0)
            pos = pos - needle.length() +1;

        return pos;
    }
}
