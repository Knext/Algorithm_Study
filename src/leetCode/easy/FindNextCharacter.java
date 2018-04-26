package leetCode.easy;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// 굳이 binary search를 할 필요가 없었다.
// 문자열은 정렬 되어 있고, 앞에서 부터 쭉 찾으면 되는 거였는데..--;
public class FindNextCharacter {
    public char nextGreatestLetter(char[] letters, char target) {

        if (letters[letters.length -1] <= target) return letters[0];
        if (letters[0] > target) return letters[0];

        int lPos = 0;
        int rPos = letters.length -1;
        int mPos = 0;
        while (lPos < rPos) {
            mPos = (lPos + rPos)/2;
            if (letters[mPos] > target) {
                rPos = mPos;
            } else if (letters[mPos] <= target){
                lPos = mPos + 1;
            }
        }

        return letters[lPos];
    }
}
