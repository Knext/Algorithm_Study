package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/construct-the-rectangle/description/
public class ConstructRectangle {
    //[L, W] L*W=area, L>=W, L-W가 가장 작은 값,
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        //최소 공약수를 찾는다.
        List<Integer> lcs = new ArrayList<>();
        for (int i = 1; i<= area; i++) { //N
            if (area % i == 0)
                lcs.add(i);
        }

        int lcsLen = lcs.size();
        result[0] = area;
        result[1] = 1;
        //모든 조합을 계산한다...느린데..어쩌지?
        for (int i = 0; i <lcsLen -1; i++) { //N*N
            int L = lcs.get(i);
            int W = area/L;
            if (L>=W && (result[0] - result[1]) >= (L - W)) {
                result[0] = L;
                result[1] = W;
            }
        }

        return result;
    }
}
