package leetCode.easy;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseIntegerTest {

    @Test
    public void testReverseInteger() throws Exception {
        ReverseInteger reverseInteger = new ReverseInteger();

        assertThat(reverseInteger.reverse(123), is(321));
        assertThat(reverseInteger.reverse(-123), is(-321));
        assertThat(reverseInteger.reverse(120), is(21));
        assertThat(reverseInteger.reverse(12000), is(21));
        assertThat(reverseInteger.reverse(1203), is(3021));
        //overflow, Integer.MAX_VALUE(2147483647)
        assertThat(reverseInteger.reverse(1534236469), is(0));
    }
}
