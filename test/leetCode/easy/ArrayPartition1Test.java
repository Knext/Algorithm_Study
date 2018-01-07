package leetCode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayPartition1Test {

    private ArrayPartition1 arrayPartition1 = new ArrayPartition1();

    @Test
    public void testArrayPartition1() throws Exception {
        assertEquals(arrayPartition1.arrayPairSum(new int[]{1,3,2,4}), 4);
        assertEquals(arrayPartition1.arrayPairSum(new int[]{9,5,4,10,12,7}), 21);
        assertEquals(arrayPartition1.arrayPairSum(new int[]{-1,2,-3,4}), -1);
        assertEquals(arrayPartition1.arrayPairSum(new int[]{-1,-3,-2,-4}), -6);
    }
}
