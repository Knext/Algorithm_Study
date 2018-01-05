package leetCode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberComplementTest {

    private NumberComplement numberComplement = new NumberComplement();

    @Test
    public void testHammingDistance() throws Exception {
        assertEquals(1, numberComplement.findComplement(0));
        assertEquals(0, numberComplement.findComplement(1));
        assertEquals(2, numberComplement.findComplement(5));
        assertEquals(5, numberComplement.findComplement(10));
        assertEquals(0, numberComplement.findComplement(3));
    }
}
