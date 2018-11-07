package leetCode.easy.dp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class MaxSubarrayTest {

    @Test
    void maxSubArray() {
        MaxSubarray maxArray = new MaxSubarray();
        Assert.assertThat(maxArray.maxSubArray(new int[]{-2,-1}), is(-1));
        Assert.assertThat(maxArray.maxSubArray(new int[]{-1,-3,-4}), is(-1));
        Assert.assertThat(maxArray.maxSubArray(new int[]{-1,3,-4}), is(3));
        Assert.assertThat(maxArray.maxSubArray(new int[]{-1,-3,1}), is(1));
        Assert.assertThat(maxArray.maxSubArray(new int[]{4,3,1}), is(8));
        Assert.assertThat(maxArray.maxSubArray(new int[]{1,-1,-2}), is(1));
        Assert.assertThat(maxArray.maxSubArray(new int[]{}), is(0));
        Assert.assertThat(maxArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}), is(6));
        Assert.assertThat(maxArray.maxSubArray(new int[]{-1,-1,0,-1,1}), is(1));
        Assert.assertThat(maxArray.maxSubArray(new int[]{1,-1,10,-1,0}), is(10));
        Assert.assertThat(maxArray.maxSubArray(new int[]{-1,-1,-10,-1,0}), is(0));
    }
}