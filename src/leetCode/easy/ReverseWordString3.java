package leetCode.easy;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
//문자열 처리는 항상 index 계산이 헷갈린다.


public class ReverseWordString3 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int i = 0;
        int wordLength = 0;
        StringBuffer stringBuffer = new StringBuffer(length);

        while (i < length) { //O(N*M)
            wordLength++;
            if (chars[i] == ' ') {
                for (int j = i - 1; j > i - wordLength; j--) { //공백 이전부터 reverse 수행한다.
                    stringBuffer.append(chars[j]);
                }
                stringBuffer.append(chars[i]); //공백인 경우 마지막에 공백을 추가한다.
                wordLength = 0;
            } else if (i == length -1) {
                for (int j = i; j > i - wordLength; j--) {
                    stringBuffer.append(chars[j]);
                }
                wordLength = 0;
            }
            i++;
        }

        return stringBuffer.toString();
    }
}
