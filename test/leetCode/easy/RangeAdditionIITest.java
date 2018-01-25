package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RangeAdditionIITest {

    @Test
    public void maxCount() {
        RangeAdditionII range = new RangeAdditionII();
        assertThat(range.maxCount(3,3,new int[][]{{2,2},{3,3}}), is(4));
        assertThat(range.maxCount(40000,40000, new int[][]{}), is(40000*40000));
        assertThat(range.maxCount(39999,39999, new int[][]{{19999,19999}}), is(19999*19999));
    }
}
