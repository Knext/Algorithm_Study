package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void canPlaceFlowers() {
        CanPlaceFlowers flowers = new CanPlaceFlowers();
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{0}, 1), is(true));
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 0), is(true));
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 1), is(true));
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 2), is(false));
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 3), is(false));
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{0,0,1,0,1}, 0), is(true));
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{0,0,1,0,1}, 1), is(true));
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{0,0,1,0,1}, 2), is(false));
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2), is(true));
        Assert.assertThat(flowers.canPlaceFlowers(new int[]{0,0,1,0,0}, 1), is(true));
    }
}