package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinimumIndexSumTest {

    @Test
    public void findRestaurant() {
        MinimumIndexSum minimumIndexSum = new MinimumIndexSum();
        assertThat(minimumIndexSum.findRestaurant(
                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Shogun", "Burger King"}),
                is(new String[]{"Shogun"}));
    }
}