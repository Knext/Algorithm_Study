package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.hamcrest.CoreMatchers.is;

class PascalsTriangleTest {

    @Test
    void test() {
        PascalsTriangle pascal = new PascalsTriangle();
        Assert.assertThat(pascal.generate(1), is(Arrays.asList(
                Arrays.asList(1))));
        Assert.assertThat(pascal.generate(2), is(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1))));
        Assert.assertThat(pascal.generate(3), is(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1))));
        Assert.assertThat(pascal.generate(4), is(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1))));
        Assert.assertThat(pascal.generate(5), is(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1),
                Arrays.asList(1,4,6,4,1))));
    }
}