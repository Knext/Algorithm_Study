package leetCode.easy.dp;

import leetCode.easy.dp.HouseRobber;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

class HouseRobberTest {

    @Test
    void rob() {
        HouseRobber hr = new HouseRobber();

        Assert.assertThat(hr.rob(new int[]{6,3,10,8,2,10,3,5,10,5,3}), is(39));
        Assert.assertThat(hr.rob(new int[]{}), is(0));
        Assert.assertThat(hr.rob(new int[]{1,2}), is(2));
        Assert.assertThat(hr.rob(new int[]{1,2,3,1}), is(4));
        Assert.assertThat(hr.rob(new int[]{2,7,9,3,1}), is(12));
        Assert.assertThat(hr.rob(new int[]{10,0,1,12}), is(22));
        Assert.assertThat(hr.rob(new int[]{1,1,1,1,1,1,10}), is(13));
        Assert.assertThat(hr.rob(new int[]{1,10,1,1,1,1,10}), is(21));
        Assert.assertThat(hr.rob(new int[]{2,1,1,2}), is(4));
        Assert.assertThat(hr.rob(new int[]{4,1,2,7,5,3,1}), is(14));
    }
}