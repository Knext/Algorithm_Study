package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    @Test
    void isPowerOfThree() {
        PowerOfThree power = new PowerOfThree();
        Assert.assertThat(power.isPowerOfThree(3), is(true));
        Assert.assertThat(power.isPowerOfThree(9), is(true));
        Assert.assertThat(power.isPowerOfThree(18), is(false));
        Assert.assertThat(power.isPowerOfThree(45), is(false));
        Assert.assertThat(power.isPowerOfThree(27), is(true));
        Assert.assertThat(power.isPowerOfThree(1), is(true));
        Assert.assertThat(power.isPowerOfThree(0), is(false));
    }
}