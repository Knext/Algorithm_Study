package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;


class UniqueMorseCodeWordsTest {

    @Test
    void test() {
        UniqueMorseCodeWords unique = new UniqueMorseCodeWords();
        Assert.assertThat(unique.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}), is(2));
        Assert.assertThat(unique.uniqueMorseRepresentations(new String[]{"gin", "zen"}), is(1));
        Assert.assertThat(unique.uniqueMorseRepresentations(new String[]{""}), is(1));
        Assert.assertThat(unique.uniqueMorseRepresentations(new String[]{"abc", "cba"}), is(2));
    }
}