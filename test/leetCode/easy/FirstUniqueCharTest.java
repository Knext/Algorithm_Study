package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FirstUniqueCharTest {

    @Test
    public void firstUniqChar() {
        FirstUniqueChar firstUniqueChar = new FirstUniqueChar();
        assertThat(firstUniqueChar.firstUniqChar("leetcode"), is(0));
        assertThat(firstUniqueChar.firstUniqChar("loveleetcode"), is(2));
        assertThat(firstUniqueChar.firstUniqChar("love"), is(0));
        assertThat(firstUniqueChar.firstUniqChar(""), is(-1));
        assertThat(firstUniqueChar.firstUniqChar("llll"), is(-1));
    }
}