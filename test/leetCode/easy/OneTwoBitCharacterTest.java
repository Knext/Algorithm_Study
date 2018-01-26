package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class OneTwoBitCharacterTest {

    @Test
    public void test_isOneBitCharacter() {
        OneTwoBitCharacter oneTwo = new OneTwoBitCharacter();
        assertThat(oneTwo.isOneBitCharacter(new int[]{0}), is(true));
        assertThat(oneTwo.isOneBitCharacter(new int[]{0,0}), is(true));
        assertThat(oneTwo.isOneBitCharacter(new int[]{1,0,1,0,0}), is(true));
        assertThat(oneTwo.isOneBitCharacter(new int[]{1,0,1,1,0}), is(true));
        assertThat(oneTwo.isOneBitCharacter(new int[]{1,0,0,0,0}), is(true));
        assertThat(oneTwo.isOneBitCharacter(new int[]{0,0,0,1,0}), is(false));
        assertThat(oneTwo.isOneBitCharacter(new int[]{1,1,1,0,1,0}), is(false));
        assertThat(oneTwo.isOneBitCharacter(new int[]{0,1,1,1,1,1,0}), is(false));
    }
}