package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BestTimeStockIITest {

    @Test
    public void maxProfit() {
        BestTimeStockII stock = new BestTimeStockII();
        assertThat(stock.maxProfit(new int[]{100}), is(0));
        assertThat(stock.maxProfit(new int[]{1,2}), is(1));
        assertThat(stock.maxProfit(new int[]{3,4,2,-1,-4,-7}), is(1));
        assertThat(stock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), is(7));
    }
}