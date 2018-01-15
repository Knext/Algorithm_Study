package leetCode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxConsecutiveOnesTest {

    @Test
    public void testMaxConsecutiveOnes() throws Exception {
        MaxConsecutiveOnes maxOne = new MaxConsecutiveOnes();

        assertEquals(maxOne.findMaxConsecutiveOnes(new int[]{1}), 1);
        assertEquals(maxOne.findMaxConsecutiveOnes(new int[]{1,1,1,0,1,1}), 3);
        assertEquals(maxOne.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,0,1,1,1,1,0}), 4);

    }
}
