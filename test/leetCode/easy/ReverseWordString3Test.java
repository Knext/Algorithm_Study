package leetCode.easy;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseWordString3Test {

    @Test
    public void testSelfDividingNumbers() throws Exception {
        ReverseWordString3 reverseWordString3 = new ReverseWordString3();

        assertThat(reverseWordString3.reverseWords("word"), is("drow"));
        assertThat(reverseWordString3.reverseWords("test word"), is("tset drow"));
        assertThat(reverseWordString3.reverseWords("Let's take LeetCode contest"),
                                             is("s'teL ekat edoCteeL tsetnoc"));
    }
}
