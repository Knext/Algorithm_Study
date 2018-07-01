package leetCode.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import java.util.Arrays;

public class FindAnagramsInStringTest {

    @Test
    public void testAnagrams() {
        FindAnagramsInString anagrams = new FindAnagramsInString();
        Assert.assertThat(anagrams.findAnagrams("abab", "ab"), is(Arrays.asList(0,1,2)));
        Assert.assertThat(anagrams.findAnagrams("cbaebabacd","abc"), is(Arrays.asList(0,6)));
    }

}