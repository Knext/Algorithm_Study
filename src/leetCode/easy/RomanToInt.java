package leetCode.easy;
//https://leetcode.com/problems/roman-to-integer/description/
/*
I - 1
II, III, IV
V - 5
VI, VII,VIII, IX
X - 10
XI, XII, XIII, XIV, XV
L - 50
C - 100
D - 500
M - 1000

Rules:
* If I comes before V or X, subtract 1 eg: IV = 4 and IX = 9
* If X comes before L or C, subtract 10 eg: XL = 40 and XC = 90
* If C comes before D or M, subtract 100 eg: CD = 400 and CM = 900

ref: https://en.wikipedia.org/wiki/Roman_numerals

Input is guaranteed to be within the range from 1 to 3999
*/

public class RomanToInt {
    public int romanToInt(String s) {
        int number = 0;
        char prev = '0';
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    if (prev == 'V' || prev == 'X') {
                        number -= 1;
                    } else {
                        number += 1;
                    }
                    break;
                case 'V':
                    number += 5;
                    break;
                case 'X':
                    if (prev == 'L' || prev == 'C') {
                        number -= 10;
                    } else {
                        number += 10;
                    }
                    break;
                case 'L':
                    number += 50;
                    break;
                case 'C':
                    if (prev == 'D' || prev == 'M') {
                        number -= 100;
                    } else {
                        number += 100;
                    }
                    break;
                case 'D':
                    number += 500;
                    break;
                case 'M':
                    number += 1000;
                    break;
            }
            prev = s.charAt(i);
        }

        return number;
    }
}
