package leetCode.easy;
//https://leetcode.com/problems/can-place-flowers/
/*
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int cnt = n;
        int prev = 0;
        int next = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i-1 >= 0) prev = flowerbed[i-1];
                if (i+1 < flowerbed.length) next = flowerbed[i+1];
                if (prev == 0 && next == 0) {
                    cnt--;
                    flowerbed[i] = 1;
                }
            }
        }

        return cnt <= 0;
    }
}
