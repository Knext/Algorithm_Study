package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    @Test
    void wordPattern() {
        WordPattern wp = new WordPattern();
        Assert.assertThat(wp.wordPattern("jquery","jquery"), is(true));
        Assert.assertThat(wp.wordPattern("a","dog"), is(true));
        Assert.assertThat(wp.wordPattern("ab","dog dog"), is(false));
        Assert.assertThat(wp.wordPattern("abba","dog cat cat dog"), is(true));
        Assert.assertThat(wp.wordPattern("abbb","dog cat cat dog"), is(false));
        Assert.assertThat(wp.wordPattern("aaaa","dog cat cat dog"), is(false));
        Assert.assertThat(wp.wordPattern("aaa","aa aa aa aa"), is(false));
    }
}