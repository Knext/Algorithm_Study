package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class MostCommonWordTest {

    @Test
    void test() {
        MostCommonWord most = new MostCommonWord();
        Assert.assertThat(most.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}), is("ball"));
        Assert.assertThat(most.mostCommonWord("a.", new String[]{""}), is("a"));
        Assert.assertThat(most.mostCommonWord("a, a, a, a, b,b,b,c", new String[]{"a"}), is("bbbc"));
    }
}