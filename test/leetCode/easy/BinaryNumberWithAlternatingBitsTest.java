package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinaryNumberWithAlternatingBitsTest {

    @Test
    public void testBinaryNumberWithAlternatingBits() throws Exception {
        BinaryNumberWithAlternatingBits alternatingBits = new BinaryNumberWithAlternatingBits();

        assertThat(alternatingBits.hasAlternatingBits(0), is(true)); //0
        assertThat(alternatingBits.hasAlternatingBits(1), is(true)); //1
        assertThat(alternatingBits.hasAlternatingBits(4), is(false)); //100
        assertThat(alternatingBits.hasAlternatingBits(5), is(true)); //101
        assertThat(alternatingBits.hasAlternatingBits(7), is(false)); //111
        assertThat(alternatingBits.hasAlternatingBits(11), is(false)); //1011
        assertThat(alternatingBits.hasAlternatingBits(10), is(true)); //1010
    }
}
