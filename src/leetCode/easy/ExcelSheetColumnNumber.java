package leetCode.easy;
//https://leetcode.com/problems/excel-sheet-column-number/description/
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int len = s.length();
        int result = 0;
        for (int i = len - 1; i >= 0; i--) {
            result += (s.charAt(i) - 64) * Math.pow(26, len - i - 1);
        }
        return result;
    }
}
