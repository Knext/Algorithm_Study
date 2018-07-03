package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIITest {

    @Test
    void containsNearbyDuplicate() {
        ContainsDuplicateII contains = new ContainsDuplicateII();
        Assert.assertThat(contains.containsNearbyDuplicate(new int[]{1,2,1}, 0), is(false));
        Assert.assertThat(contains.containsNearbyDuplicate(new int[]{1,2,3,1}, 3), is(true));
        Assert.assertThat(contains.containsNearbyDuplicate(new int[]{1,0,1,1}, 1), is(true));
        Assert.assertThat(contains.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2), is(false));
        Assert.assertThat(contains.containsNearbyDuplicate(new int[]{1}, 1), is(false));
        Assert.assertThat(contains.containsNearbyDuplicate(new int[]{99,99}, 2), is(true));
    }
}