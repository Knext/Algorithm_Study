package leetCode.easy;
//https://leetcode.com/problems/detect-capital/description/
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean bCapital = true;
        boolean bSmall = true;
        boolean bFirstCapital = false;
        //1. 모든 문자가 대문자, 모든 문자가 소문자, 첫번째 문자만 대문자.
        bFirstCapital = isCapital(word.charAt(0)) ? true : false;
        for(int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (bFirstCapital) {
                bCapital &= isCapital(ch); //모두 대문자?
                bSmall &= isSmall(ch); //모두 소문자?
            } else { //모두 small
                bSmall &= isSmall(ch);
            }
        }
        if (bFirstCapital && bCapital) return true;
        if (bFirstCapital && bSmall) return true;
        if (bSmall) return true;

        return false;
    }

    private boolean isSmall(char ch) {
        return ch >= 'a' && ch <='z';
    }

    private boolean isCapital(char ch) {
        return ch >= 'A' && ch <='Z';
    }
}
