package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

class DegreeArrayTest {

    @Test
    void test() {
        DegreeArray degreeArray = new DegreeArray();
//        Assert.assertThat(degreeArray.findShortestSubArray(new int[]{1}), is(1));
//        Assert.assertThat(degreeArray.findShortestSubArray(new int[]{1,1,1}), is(3));
        Assert.assertThat(degreeArray.findShortestSubArray(new int[]{1,2,1}), is(3));
        Assert.assertThat(degreeArray.findShortestSubArray(new int[]{1, 2, 2, 3, 1}), is(2));
        Assert.assertThat(degreeArray.findShortestSubArray(new int[]{1,2,2,3,1,4,2}), is(6));
        Assert.assertThat(degreeArray.findShortestSubArray(new int[]{1,1,2,2,3,3,3}), is(3));
    }
}