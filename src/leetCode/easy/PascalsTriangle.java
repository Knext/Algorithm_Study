package leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        result.add(Arrays.asList(1));
        if (numRows == 1) return result;

        result.add(Arrays.asList(1,1));
        if (numRows == 2) return result;

        for (int nDepth = 2; nDepth < numRows; nDepth++) {
            List<Integer> prevTriangles = result.get(nDepth-1); //Previous Depth Triangle List
            Integer [] triangles = new Integer[nDepth+1]; // triangle int array
            triangles[0] = 1; //first triangle
            for (int j = 1; j < prevTriangles.size(); j++) {
                triangles[j] = prevTriangles.get(j-1) + prevTriangles.get(j);
            }
            triangles[nDepth] = 1; //last triangle
            result.add(Arrays.asList(triangles));
        }
        return result;
    }
}
