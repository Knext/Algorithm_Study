package leetCode.easy;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NextGreaterElement1Test {

    @Test
    public void testNextGreaterElement1() throws Exception {
        NextGreaterElement1 nextGreaterElement1 = new NextGreaterElement1();

        assertThat(nextGreaterElement1.nextGreaterElement(
                new int[]{4,1,2},new int[]{1,3,4,2}), is(new int[]{-1,3,-1}));
        assertThat(nextGreaterElement1.nextGreaterElement(
                new int[]{2,4},new int[]{1,2,3,4}),is(new int[]{3,-1}));
        assertThat(nextGreaterElement1.nextGreaterElement(
                new int[]{1,3,5,2,4},new int[]{6,5,4,3,2,1,7}),is(new int[]{7,7,7,7,7}));
    }
}
