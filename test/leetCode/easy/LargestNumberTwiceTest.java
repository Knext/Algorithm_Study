package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LargestNumberTwiceTest {

    @Test
    public void dominantIndex() {
        LargestNumberTwice large = new LargestNumberTwice();
        assertThat(large.dominantIndex(new int[]{1,2,3,4}), is(-1));
        assertThat(large.dominantIndex(new int[]{3,6,1,0}), is(1));
    }
}