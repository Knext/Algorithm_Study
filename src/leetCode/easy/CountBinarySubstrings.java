package leetCode.easy;
//https://leetcode.com/problems/count-binary-substrings/description/

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int length = s.length();
        int []index = new int[length]; //연속된 문자열 개수를 저장..
        int cnt = 0;

        for (int i = 0; i < length; i++) { // O(N)
            char cur = s.charAt(i);
            int sameNum = 1; //자기 자신을 포함하기 때문에 1부터 시작
            int j = i +1;
            while (j < length) {  // O(M) N보다 한참 작은수...
                if (cur != s.charAt(j)) break;
                j++;
                sameNum++;
            }
            index[i] = sameNum;
            while (--sameNum > 0) { // O(N)
                index[++i] = sameNum;
            }
        }

        for (int i = 0; i < length; i++) { //O(N)
            int next = index[i];
            if (i + next < length && index[i] - index[i + next] <= 0) cnt++;
        }
        return cnt;

    }

    /* Time Limit Exception..... 너무 느리다.
    public int countBinarySubstrings(String s) {
        int length = s.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            char start = s.charAt(i);
            int cnt = 1;
            int j = i + 1;
            int lastSameCnt = 0;
            if (lastSameCnt == 0) {
                for (; j < length; j++) {
                    if (start == s.charAt(j)) {
                        cnt++;
                    } else break;
                }
                lastSameCnt = cnt;
            } else {
                cnt = lastSameCnt - 1;
            }
            for (; j < length && cnt > 0; j++) {
                if (start != s.charAt(j)) {
                    cnt--;
                } else break;
            }

            if (cnt == 0) result++;
        }
        return result;
    }
    */
}
