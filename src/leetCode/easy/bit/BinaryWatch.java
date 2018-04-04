package leetCode.easy.bit;

import java.util.*;

import static java.util.stream.Collectors.toList;

//https://leetcode.com/problems/binary-watch/description/
public class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        if (num == 0) return Arrays.asList("0:00");

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
        List<Integer> hours = new ArrayList<>();
        for (int j = 0; j < 12; j++) {
            if (bitNum == Integer.bitCount(j))
                hours.add(j);
        }
        return hours.stream().mapToInt(i->i).toArray();
    }

    private int[] minList(int bitNum) {
        List<Integer> mins = new ArrayList<>();
        for (int j = 0; j < 60; j++) {
            if (bitNum == Integer.bitCount(j))
                mins.add(j);
        }
        return mins.stream().mapToInt(i->i).toArray();
    }
}
