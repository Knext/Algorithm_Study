package leetCode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberSetBitsTest {

    @Test
    public void testprimeNumberSetBits() throws Exception {
        PrimeNumberSetBits primeNumberSetBits = new PrimeNumberSetBits();

        assertEquals(primeNumberSetBits.countPrimeSetBits(6, 10), 4);
        assertEquals(primeNumberSetBits.countPrimeSetBits(10, 15), 5);
    }
}
