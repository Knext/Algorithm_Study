package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {

    @Test
    void numJewelsInStones() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        Assert.assertThat(jewelsAndStones.numJewelsInStones("", "bbbbb"), is(0));
        Assert.assertThat(jewelsAndStones.numJewelsInStones("A", "a"), is(0));
        Assert.assertThat(jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"), is(3));
        Assert.assertThat(jewelsAndStones.numJewelsInStones("a", "bbbb"), is(0));
        Assert.assertThat(jewelsAndStones.numJewelsInStones("a", ""), is(0));
        Assert.assertThat(jewelsAndStones.numJewelsInStones("z", "ZZ"), is(0));
    }
}