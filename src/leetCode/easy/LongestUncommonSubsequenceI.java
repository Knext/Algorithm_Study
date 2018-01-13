package leetCode.easy;
//https://leetcode.com/problems/longest-uncommon-subsequence-i/description/
// 이런 문제 싫다... 문제 의도가 뭔지 한참 헤맸네.
// 그냥 의도가 뭔지 몰라서 푸는데 오래걸림.. Sample Test도 부족하고.
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        if (aLen > bLen) {
            return aLen;
        } else if (bLen > aLen){
            return bLen;
        } else {
            if (a.equals(b))
                return -1;
            else
                return aLen;
        }
    }
}
