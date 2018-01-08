package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DistributeCandiesTest {

    @Test
    public void testBaseBallGameTest() throws Exception {
        DistributeCandies distributeCandies = new DistributeCandies();

        assertThat(distributeCandies.distributeCandies(new int[]{1,1,2,2,3,3}), is(3));
        assertThat(distributeCandies.distributeCandies(new int[]{1,1,2,3}), is(2));
    }
}
