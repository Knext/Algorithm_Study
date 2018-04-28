package leetCode.easy.dp;

import leetCode.easy.dp.MinCostStairs;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinCostStairsTest {

    @Test
    public void minCostClimbingStairs() {
        MinCostStairs minCostStairs = new MinCostStairs();
        assertThat(minCostStairs.minCostClimbingStairs(new int[]{10,15,20}), is(15));
        assertThat(minCostStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}), is(6));
        assertThat(minCostStairs.minCostClimbingStairs(new int[]{0,1,2,2}), is(2));
    }
}