package leetCode.easy;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseStringTest {

    @Test
    public void testReverseString() throws Exception {
        ReverseString reverseString = new ReverseString();

        assertThat(reverseString.reverseString("hello"), is("olleh"));
        assertThat(reverseString.reverseString("hello world"), is("dlrow olleh"));
    }
}
