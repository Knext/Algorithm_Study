package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class SpecialGroupStringTest {

    @Test
    void test() {
        SpecialGroupString special = new SpecialGroupString();
        Assert.assertThat(special.numSpecialEquivGroups(new String[]{"a","b","c","a","c","c"}), is(3));
        Assert.assertThat(special.numSpecialEquivGroups(new String[]{"aa","bb","ab","ba"}), is(4));
        Assert.assertThat(special.numSpecialEquivGroups(new String[]{"abc","acb","bac","bca","cab","cba"}), is(3));
        Assert.assertThat(special.numSpecialEquivGroups(new String[]{"abcd","cdab","adcb","cbad"}), is(1));
        Assert.assertThat(special.numSpecialEquivGroups(new String[]{"couxuxaubw","zsptcwcghr","kkntvvhbcc","nkhtcvvckb","crcwhspgzt"}), is(3));

    }
}