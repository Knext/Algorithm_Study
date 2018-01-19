package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DetectCapitalTest {

    @Test
    public void test_detectCapitalUse() {
        DetectCapital detectCapital = new DetectCapital();
        assertThat(detectCapital.detectCapitalUse("USA"), is(true));
        assertThat(detectCapital.detectCapitalUse("leetcode"), is(true));
        assertThat(detectCapital.detectCapitalUse("Google"), is(true));
        assertThat(detectCapital.detectCapitalUse("GooglE"), is(false));
        assertThat(detectCapital.detectCapitalUse("UsA"), is(false));
        assertThat(detectCapital.detectCapitalUse("leetCode"), is(false));
    }
}