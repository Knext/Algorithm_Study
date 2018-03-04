package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertThat(validAnagram.isAnagram("", ""), is(true));
        assertThat(validAnagram.isAnagram("anagram", "nagaram"), is(true));
        assertThat(validAnagram.isAnagram("car", "rat"), is(false));
        assertThat(validAnagram.isAnagram("ab", "a"), is(false));
    }
}