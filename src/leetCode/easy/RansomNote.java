package leetCode.easy;

//https://leetcode.com/problems/ransom-note/description/
//문자열 비교로 접근하면, 최소 O(nlogn) 시간이 필요함.
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int charTable[] = new int[26]; //소문자 26개를 저장하기 위한 Table
        for (char c: magazine.toCharArray()) charTable[c-'a']++; //O(N)
        for (char c: ransomNote.toCharArray()) charTable[c-'a']--; //O(M)
        for(int i: charTable) { //O(26)
            if (i < 0) return false;
        }
        return true;
    }
}
