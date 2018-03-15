package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        assertThat(containsDuplicate.containsDuplicate(new int[]{}), is(false));
        assertThat(containsDuplicate.containsDuplicate(new int[]{1,1,2}), is(true));
        assertThat(containsDuplicate.containsDuplicate(new int[]{3,3}), is(true));
        assertThat(containsDuplicate.containsDuplicate(new int[]{1}), is(false));
        assertThat(containsDuplicate.containsDuplicate(new int[]{1,2,3}), is(false));
        assertThat(containsDuplicate.containsDuplicate(new int[]{1,1,2,2,3}), is(true));
    }
}