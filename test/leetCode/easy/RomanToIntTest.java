package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanToIntTest {

    @Test
    public void romanToInt() {
        RomanToInt rom = new RomanToInt();
        assertThat(rom.romanToInt("I"), is(1));
        assertThat(rom.romanToInt("III"), is(3));
        assertThat(rom.romanToInt("IV"), is(4));
        assertThat(rom.romanToInt("IX"), is(9));
        assertThat(rom.romanToInt("XXI"), is(21));
        assertThat(rom.romanToInt("MDCCLXXVI"), is(1776));
        assertThat(rom.romanToInt("MCMLIV"), is(1954));
    }
}