package leetCode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/groups-of-special-equivalent-strings/description/
public class SpecialGroupString {
    //O(N*(M+nlogn)) ==> O(N*nlogn)
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String word : A) { //O(N)
            char [] w_chars = word.toCharArray();
            char [] even = new char[word.length()/2+1];
            char [] odd = new char[word.length()/2+1];
            int x = 0;
            int y = 0;
            for (int i = 0; i< w_chars.length; i++) { //O(M)
                if (i%2 == 0) {
                    even[x++] = w_chars[i];
                } else {
                    odd[y++] = w_chars[i];
                }
            }

            Arrays.sort(even); //O(nlogn)
            Arrays.sort(odd);
            set.add(new String(even)+ new String(odd));
        }

        return set.size();
    }
}
