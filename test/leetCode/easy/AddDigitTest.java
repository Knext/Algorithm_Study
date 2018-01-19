package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AddDigitTest {

    @Test
    public void addDigits() {
        AddDigit addDigit = new AddDigit();
        assertThat(addDigit.addDigits(10), is(1));
        assertThat(addDigit.addDigits(38), is(2));
        assertThat(addDigit.addDigits(401), is(5));
        assertThat(addDigit.addDigits(9), is(9));
        assertThat(addDigit.addDigits(18), is(9));
        assertThat(addDigit.addDigits(101), is(2));
    }
}