package leetCode.easy;
//https://leetcode.com/problems/1-bit-and-2-bit-characters/description/
//10, 11, 0
//last bit is always '0'
//1 <= len(bits) <= 1000.
//bits[i] is always 0 or 1.
public class OneTwoBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int bitLen = bits.length;
        while(i < bitLen-1) {
            if (bits[i] == 1) {
                i += 2;
            } else {
                i++;
            }
        }
        //이전 값이 0이 아니고, length를 넘어선다면, 10 또는 11로 끝난다.
        return i == bitLen -1;
    }
}
