package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RansomNoteTest {

    @Test
    public void canConstruct() {
        RansomNote ransomNote = new RansomNote();
        assertThat(ransomNote.canConstruct("", ""), is(true));
        assertThat(ransomNote.canConstruct("", "ab"), is(true));
        assertThat(ransomNote.canConstruct("a", ""), is(false));
        assertThat(ransomNote.canConstruct("a", "b"), is(false));
        assertThat(ransomNote.canConstruct("aa", "ab"), is(false));
        assertThat(ransomNote.canConstruct("aaa", "cab"), is(false));
        assertThat(ransomNote.canConstruct("aa", "aab"), is(true));
        assertThat(ransomNote.canConstruct("aa", "abab"), is(true));
        assertThat(ransomNote.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"), is(false));
        assertThat(ransomNote.canConstruct("i", "dgbcacfbeaghfb"), is(false));
    }
}