package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {

    @Test
    void countPrimes() {
        CountPrimes countPrimes = new CountPrimes();
        Assert.assertThat(countPrimes.countPrimes(1), is(0));
        Assert.assertThat(countPrimes.countPrimes(2), is(0));
        Assert.assertThat(countPrimes.countPrimes(3), is(1));
        Assert.assertThat(countPrimes.countPrimes(10), is(4));
        Assert.assertThat(countPrimes.countPrimes(20), is(8));
        Assert.assertThat(countPrimes.countPrimes(1000), is(168));
        Assert.assertThat(countPrimes.countPrimes(499979), is(41537));
    }
}