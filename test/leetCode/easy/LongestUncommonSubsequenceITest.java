package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LongestUncommonSubsequenceITest {

    @Test
    public void testLongestUncommonSubsequenceI() throws Exception {
        LongestUncommonSubsequenceI longest = new LongestUncommonSubsequenceI();

        assertThat(longest.findLUSlength("aba","cdc"), is(3));
        assertThat(longest.findLUSlength("aba","cdcef"), is(5));
        assertThat(longest.findLUSlength("aba","aba"), is(-1));
        assertThat(longest.findLUSlength("aba","abe"), is(3));
        assertThat(longest.findLUSlength("aefawfawfawfaw","aefawfeawfwafwaef"), is(17));
    }

}
