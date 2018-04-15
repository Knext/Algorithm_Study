package leetCode.easy;
//https://leetcode.com/problems/student-attendance-record-i/description/
public class StudentRecordI {
    public boolean checkRecord(String s) {
        int cntA = 0;
        int nLate = 0;
        for (char stat:s.toCharArray()) {
            if (stat == 'L') {
                nLate++;
            } else {
                nLate = 0;
            }
            if (stat == 'A') cntA++;

            if (cntA > 1 || nLate >2) return false;
        }

        return true;
    }
}
