package leetCode.easy;

//https://leetcode.com/problems/add-strings/description/
//단순하게 integer간의 합으로 생각하면 문제를 풀기 어려움.
//한자리수 덧셈을 계산한 값을 이용해서 문자열로 처리해야 함.
public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuffer strBuf = new StringBuffer();
        int idxN1 = num1.length() -1;
        int idxN2 = num2.length() -1;
        int addition = 0;
        while (idxN1 >= 0 || idxN2 >= 0 || addition >= 1 ) {
            int n1 = 0;
            int n2 = 0;
            if (idxN1 >= 0) n1 = charToInt(num1.charAt(idxN1));
            if (idxN2 >= 0) n2 = charToInt(num2.charAt(idxN2));

            int n3 = (n1 + n2 + addition) % 10;
            addition = (n1 + n2 + addition) / 10;

            strBuf.append(n3);
            idxN1--;
            idxN2--;
        }

        return strBuf.reverse().toString();
    }

    private int charToInt(char num) {
        return num - 48;
    }
}
