package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinimumMovesTest {

    @Test
    public void minMoves() {
        MinimumMoves minMove = new MinimumMoves();
        assertThat(minMove.minMoves(new int[]{1}), is(0));
        assertThat(minMove.minMoves(new int[]{1,1,1}), is(0));
        assertThat(minMove.minMoves(new int[]{1,2,3}), is(3));
        assertThat(minMove.minMoves(new int[]{5,2,3}), is(4));
        assertThat(minMove.minMoves(new int[]{5,5,4}), is(2));
        assertThat(minMove.minMoves(new int[]{1,2147483647}), is(2147483646));
        assertThat(minMove.minMoves(new int[]{1,1,1,2147483647}), is(2147483646));
    }
}