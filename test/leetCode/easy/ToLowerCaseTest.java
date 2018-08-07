package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class ToLowerCaseTest {

    @Test
    void toLowerCase() {
        ToLowerCase lowerCase = new ToLowerCase();
        Assert.assertThat(lowerCase.toLowerCase("Hello"), is("hello"));
        Assert.assertThat(lowerCase.toLowerCase("HELLO"), is("hello"));
        Assert.assertThat(lowerCase.toLowerCase("LoVe"), is("love"));
        Assert.assertThat(lowerCase.toLowerCase("HEllO"), is("hello"));
        Assert.assertThat(lowerCase.toLowerCase("BeauTiFul"), is("beautiful"));
    }
}