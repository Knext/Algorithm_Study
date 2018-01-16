package leetCode.easy;
//https://leetcode.com/problems/nim-game/description/
//두명이 '1~3'까지 숫자를 제시해서 마지막 숫자 지우기, 지우는 사람이 승자.
//상대방이 '4'를 가지면 이긴다.
public class NimGame {
    public boolean canWinNim(int n) {
        return (n % 4) != 0;
    }
}
