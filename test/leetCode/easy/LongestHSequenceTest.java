package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class LongestHSequenceTest {

    @Test
    void findLHS() {
        LongestHSequence lhs = new LongestHSequence();
        Assert.assertThat(lhs.findLHS(new int[]{1,3,2,2,5,2,3,7}), is(5));
        Assert.assertThat(lhs.findLHS(new int[]{1}), is(0));
        Assert.assertThat(lhs.findLHS(new int[]{1,2,0,3,5}), is(2));
        Assert.assertThat(lhs.findLHS(new int[]{0,0,0,3,5}), is(0));
        Assert.assertThat(lhs.findLHS(new int[]{1,1,1,1}), is(0));
        Assert.assertThat(lhs.findLHS(new int[]{1,3,5,7}), is(0));
        Assert.assertThat(lhs.findLHS(new int[]{1,3,1,3,2,3,0,3,0,1,2,2,2,-1,2,1,0,0,2,2,3,-3,1,2,2,0,1,3,1}), is(16));

    }
}