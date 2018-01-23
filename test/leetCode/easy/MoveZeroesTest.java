package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        MoveZeroes move = new MoveZeroes();

        int[] org = new int[]{0,1,0,3,12};
        move.moveZeroes(org);
        assertThat(org, is(new int[]{1,3,12,0,0}));
        org = new int[]{1};
        assertThat(org, is(new int[]{1}));
    }
}