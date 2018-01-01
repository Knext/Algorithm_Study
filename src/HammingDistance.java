//https://leetcode.com/problems/hamming-distance/description/
public class HammingDistance {
    public static void main(String[]args){
        HammingDistance hamming = new HammingDistance();
        System.out.println(hamming.hammingDistance(1,4));
    }

    //Integer.bitCount()
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int numberOfDistance = 0;
        for (int i = 0; i < 32 ; i++) { //iteration for 32bit
            numberOfDistance += xor & 1;
            xor >>= 1;
        }
        return numberOfDistance;
    }
}

