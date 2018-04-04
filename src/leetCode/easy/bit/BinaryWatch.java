package leetCode.easy.bit;

import java.util.*;

//https://leetcode.com/problems/binary-watch/description/
//map으로 계산 결과를 저장해서 재활용 하는데, 특별한 속도 개선 효과는 못봄.
public class BinaryWatch {
    Map<Integer, List<Integer>> hourMap = new HashMap<>();
    Map<Integer, List<Integer>> minMap = new HashMap<>();

    public List<String> readBinaryWatch(int num) {
        if (num == 0) return Arrays.asList("0:00");
        hourMap.clear();
        minMap.clear();

        List<String> result = new ArrayList<>();

        for (int i = 0; i <= num; i++) {
            int[] hours = hourList(i);
            int[] mins = minList(num - i);
            for (Integer hour: hours) {
                String hour_str = "";
                hour_str += hour + ":";
                for (Integer min: mins) {
                    String min_str = "";
                    min_str += ((min < 10) ? "0" + min : min);
                    result.add(hour_str + min_str);
                }
            }
        }
        return result;
    }


    private int[] hourList(int bitNum) {
        if (hourMap.containsKey(bitNum))
            return hourMap.get(bitNum).stream().mapToInt(i->i).toArray();

        List<Integer> hours = new ArrayList<>();
        for (int j = 0; j < 12; j++) {
            if (bitNum == Integer.bitCount(j))
                hours.add(j);
        }
        hourMap.put(bitNum, hours);
        return hours.stream().mapToInt(i->i).toArray();
    }

    private int[] minList(int bitNum) {
        if (minMap.containsKey(bitNum))
            return minMap.get(bitNum).stream().mapToInt(i->i).toArray();

        List<Integer> mins = new ArrayList<>();
        for (int j = 0; j < 60; j++) {
            if (bitNum == Integer.bitCount(j))
                mins.add(j);
        }

        minMap.put(bitNum, mins);
        return mins.stream().mapToInt(i->i).toArray();
    }
}
