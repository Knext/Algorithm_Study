package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LongestSubsequenceTest {

    @Test
    public void findLengthOfLCIS() {
        LongestSubsequence LS = new LongestSubsequence();
        assertThat(LS.findLengthOfLCIS(new int[]{1,3,5,4,7}), is(3));
        assertThat(LS.findLengthOfLCIS(new int[]{2,2,2,2,2}), is(1));
    }
}