package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FindDifferenceTest {

    @Test
    public void test_findTheDifference() {
        FindDifference findDifference = new FindDifference();
        assertThat(findDifference.findTheDifference("abcd","abcde"),is('e'));
        assertThat(findDifference.findTheDifference("abcd","ebacd"),is('e'));
        assertThat(findDifference.findTheDifference("abcd","dceba"),is('e'));
    }
}