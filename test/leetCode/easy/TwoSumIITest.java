package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TwoSumIITest {

    @Test
    public void twoSum() {
        TwoSumII twoSum = new TwoSumII();
        assertThat(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9), is(new int[]{1,2}));
        assertThat(twoSum.twoSum(new int[]{-2, 7, 11, 15}, 13), is(new int[]{1,4}));
        assertThat(twoSum.twoSum(new int[]{2, 7, 11, 15}, 17), is(new int[]{1,4}));
        assertThat(twoSum.twoSum(new int[]{1,3,5,7,9}, 16), is(new int[]{4,5}));
        assertThat(twoSum.twoSum(new int[]{1,3,5,9}, 10), is(new int[]{1,4}));
        assertThat(twoSum.twoSum(new int[]{1,2,3,4,5,6,7,8,9,100}, 101), is(new int[]{1,10}));
        assertThat(twoSum.twoSum(new int[]{0,0,3,4}, 0), is(new int[]{1,2}));
        assertThat(twoSum.twoSum(new int[]{0,0,0,0,0,0,0,0,0,3,4,9,9,9,}, 7), is(new int[]{10,11}));
        assertThat(twoSum.twoSum(new int[]{1,1,2,4}, 2), is(new int[]{1,2}));
    }
}