package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntersectionTwoArraysTest {

    @Test
    public void intersection() {
        IntersectionTwoArrays intersection = new IntersectionTwoArrays();
        assertThat(intersection.intersection(new int[]{1,2,2,1}, new int[]{2,2}), is(new int[]{2}));
        assertThat(intersection.intersection(new int[]{5,0,1,4,2,2}, new int[]{3,2,2}), is(new int[]{2}));
    }
}