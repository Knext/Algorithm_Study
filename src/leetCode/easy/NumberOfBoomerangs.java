package leetCode.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-boomerangs/description/
// 순열 부분을 조합으로 착각해서 한참을 헤맴...N!/(N-k)!, N개 중에서 K개를 순서 상관없이 뽑는 경우
// 수학의 정석 공부해야 하나.....OTL
public class NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int number = 0;
        for (int i = 0; i < points.length; i++) { //O(N*N)
            Map<Double, Integer> numberMap = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    double key = getDistance(points, i, j);
                    numberMap.put(key, numberMap.getOrDefault(key, 0) + 1);
                }
            }
            number += calcBoomerang(numberMap);
            numberMap.clear();
        }

        return number;
    }

    private int calcBoomerang(Map<Double, Integer> numberMap) {
        int number = 0;
        for (Integer value : numberMap.values()) {// O(N)
            number += value * (value -1); // N개 중에 2개를 뽑는 경우 n!/(n-2)! = n(n-1)
        }
        return number;
    }

    private double getDistance(int [][] points, int start, int end) {
        double x = points[start][0] - points[end][0];
        double y = points[start][1] - points[end][1];
        return x*x + y*y;
    }
}
