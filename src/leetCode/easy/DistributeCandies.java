package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/distribute-candies/description/
// sister를 set으로 구성하고, 최대한 가질 수 있는 크기를 찾는다.
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        int result = 0;
        Set<Integer> sisterSet = new HashSet<>();
        for (int candy: candies) {
            sisterSet.add(candy);
        }

        if (sisterSet.size() >= candies.length/2)
            result = candies.length/2;
        else
            result = sisterSet.size();

        return result;
    }
}
