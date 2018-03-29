package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void missingNumber() {
        MissingNumber missingNumber = new MissingNumber();
        assertThat(missingNumber.missingNumber(new int[]{}), is(0));
        assertThat(missingNumber.missingNumber(new int[]{3,2,0}), is(1));
        assertThat(missingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}), is(8));
        assertThat(missingNumber.missingNumber(new int[]{6,4,2,3,5,7,0,1,8}), is(9));
    }
}