package medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    @Test
    void decodeString() {
        DecodeString decodeString = new DecodeString();
        Assert.assertThat(decodeString.decodeString("10[a]"), is("aaaaaaaaaa"));
        Assert.assertThat(decodeString.decodeString("3[a]2[bc]"), is("aaabcbc"));
        Assert.assertThat(decodeString.decodeString("3[a2[bc]]"), is("abcbcabcbcabcbc"));
        Assert.assertThat(decodeString.decodeString("3[a2[c]]"), is("accaccacc"));
        Assert.assertThat(decodeString.decodeString("2[abc]3[cd]ef"), is("abcabccdcdcdef"));
    }
}