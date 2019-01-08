package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class StrStrTest {

    @Test
    public void strStr() {
        StrStr str = new StrStr();
        Assert.assertThat(str.strStr("","a"), is(-1));
        Assert.assertThat(str.strStr("hello",""), is(0));
        Assert.assertThat(str.strStr("hello",null), is(0));
        Assert.assertThat(str.strStr("hello","ll"), is(2));
        Assert.assertThat(str.strStr("aaaaa","baa"), is(-1));
        Assert.assertThat(str.strStr("abcdefa","a"), is(0));
        Assert.assertThat(str.strStr("mississippi","issipi"), is(-1));
    }
}