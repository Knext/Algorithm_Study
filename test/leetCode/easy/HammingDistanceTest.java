package leetCode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {

    private HammingDistance hammingDistance = new HammingDistance();

    @Test
    public void testHammingDistance() throws Exception {
        assertEquals(hammingDistance.hammingDistance(1,4), 2);
        assertEquals(hammingDistance.hammingDistance(0,4), 1);
    }
}
