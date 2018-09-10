package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest {

    @Test
    void test() {
        BackspaceStringCompare compare = new BackspaceStringCompare();

        Assert.assertThat(compare.backspaceCompare("",""), is(true));
        Assert.assertThat(compare.backspaceCompare("a","b"), is(false));
        Assert.assertThat(compare.backspaceCompare("###","#"), is(true));
        Assert.assertThat(compare.backspaceCompare("###d","#d"), is(true));
        Assert.assertThat(compare.backspaceCompare("ab#c","ad#c"), is(true));
        Assert.assertThat(compare.backspaceCompare("ab##","c#d#"), is(true));
        Assert.assertThat(compare.backspaceCompare("a#c","b"), is(false));
        Assert.assertThat(compare.backspaceCompare("y#fo##f","y#f#o##f"), is(true));
    }
}