package leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(1));
        assertFalse(happyNumber.isHappy(2));
        assertFalse(happyNumber.isHappy(3));
        assertFalse(happyNumber.isHappy(4));
        assertFalse(happyNumber.isHappy(5));
        assertTrue(happyNumber.isHappy(7));
        assertTrue(happyNumber.isHappy(10));
        assertFalse(happyNumber.isHappy(11));
        assertTrue(happyNumber.isHappy(13));
        assertTrue(happyNumber.isHappy(19));
        assertFalse(happyNumber.isHappy(111));
    }
}