package leetCode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/assign-cookies/description/
//greedy algorithm. 최선의 값을 하나씩 찾아간다.
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {

        int maxValue = 0;
        if (g == null || s == null) return maxValue;
        Arrays.sort(g); //O(glogg)
        Arrays.sort(s); //O(slogs)
        int g_index = 0;
        int s_index = 0;
        while (g_index < g.length && s_index < s.length) { //O(N)
           if (g[g_index] <= s[s_index]) {
               maxValue++;
               g_index++;
               s_index++;
           } else {
               s_index++;
           }
        }

        return maxValue;
    }

}
