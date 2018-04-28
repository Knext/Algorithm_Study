package leetCode.easy.dp;
//https://leetcode.com/problems/min-cost-climbing-stairs/description/
//현재 계단의 비용을 지불하면 한칸 또는 두칸 이동 가능하다
//시작은 0번째 또는 1번째에서 가능하다.
//계단 끝(배열 끝)까지 가는 최소 비용은?
//현재 계단의 최소 값은 이전, 그 이전 계단 비용으로 계산 된다.Dynamic Programming.
public class MinCostStairs {

    public int minCostClimbingStairs(int[] cost) {
        if (cost ==null || cost.length == 0) return 0;
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int [] costTable = new int[cost.length];
        costTable[0] = cost[0];
        costTable[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            costTable[i] = Math.min(costTable[i-1], costTable[i-2]) + cost[i];
        }

        return Math.min(costTable[cost.length -1], costTable[cost.length-2]);
    }
}
