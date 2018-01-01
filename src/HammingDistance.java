//https://leetcode.com/problems/hamming-distance/description/
public class HammingDistance {
    public static void main(String[]args){
        HammingDistance hamming = new HammingDistance();
        System.out.println(hamming.hammingDistance(1,4));
    }

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int mask = 0x00000001;
        int numberOfDistance = 0;
        for (int i = 0; i < 32 ; i++) {
            if ((xor & mask) > 0) {
                numberOfDistance++;
            }
            mask <<= 1;
        }
        return numberOfDistance;
    }
}

