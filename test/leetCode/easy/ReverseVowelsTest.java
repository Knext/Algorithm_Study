package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

class ReverseVowelsTest {

    @Test
    void reverseVowels() {
        ReverseVowels reverse = new ReverseVowels();
        Assert.assertThat(reverse.reverseVowels("hello"), is("holle"));
        Assert.assertThat(reverse.reverseVowels("hll"), is("hll"));
        Assert.assertThat(reverse.reverseVowels("leetcode"), is("leotcede"));
        Assert.assertThat(reverse.reverseVowels("aeiou"), is("uoiea"));
        Assert.assertThat(reverse.reverseVowels("aA"), is("Aa"));
        Assert.assertThat(reverse.reverseVowels("HEllo"), is("HollE"));
    }
}