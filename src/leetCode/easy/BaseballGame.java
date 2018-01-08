package leetCode.easy;

import java.util.Stack;

//https://leetcode.com/problems/baseball-game/description/
//stack을 쓰는게 array를 사용하는 것보다, index 관리에서 실수할 가능성이 낮다.
public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (String op: ops) {
            switch (op) {
                case "C": {//Represents the last valid round's points you get were invalid
                          // and should be removed.
                    total -= stack.pop();
                    break;}
                case "D": {//Represents that the points you get in this round
                          // are the doubled data of the last valid round's points.
                    int value = stack.peek() * 2;
                    stack.push(value);
                    total += value;
                    break;}
                case "+": {//Represents that the points you get in this round
                          // are the sum of the last two valid round's points.
                    int top = stack.pop();
                    int secondTop = stack.pop();
                    stack.push(secondTop);
                    stack.push(top);
                    stack.push(top+secondTop);
                    total += (top+secondTop);
                    break;}
                default: {//Directly represents the number of points you get in this round.
                    int value = Integer.parseInt(op);
                    stack.push(value);
                    total += value;
                    break;}
            }
        }

        return total;
    }
}
