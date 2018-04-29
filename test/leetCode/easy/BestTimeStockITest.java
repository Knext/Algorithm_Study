package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BestTimeStockITest {

    @Test
    public void maxProfit() {
        BestTimeStockI stock = new BestTimeStockI();
        assertThat(stock.maxProfit(new int[]{7,1,5,3,6,4}), is(5));
        assertThat(stock.maxProfit(new int[]{7,6,4,3,1}), is(0));
        assertThat(stock.maxProfit(new int[]{3,2,6,5,0,3}), is(4));
    }
}