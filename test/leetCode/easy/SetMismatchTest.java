package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class SetMismatchTest {

    @Test
    void findErrorNums() {
        SetMismatch setMismatch = new SetMismatch();
        Assert.assertThat(setMismatch.findErrorNums(new int[]{1,2,2,4}), is(new int[]{2,3}));
        Assert.assertThat(setMismatch.findErrorNums(new int[]{1,1,3}), is(new int[]{1,2}));
    }
}