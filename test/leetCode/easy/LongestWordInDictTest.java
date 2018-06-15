package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class LongestWordInDictTest {

    @Test
    void longestWord() {
        LongestWordInDict longest = new LongestWordInDict();
        Assert.assertThat(longest.longestWord(new String[]{""}), is(""));
        Assert.assertThat(longest.longestWord(new String[]{"a","banana","app","appl","ap","apply","apple"}), is("apple"));
        Assert.assertThat(longest.longestWord(new String[]{"w","wo","wor","worl", "world"}), is("world"));
        Assert.assertThat(longest.longestWord(new String[]{"a", "app", "appl", "ap", "apply", "apple"}), is("apple"));
        Assert.assertThat(longest.longestWord(new String[]{"b","br","bre","brea","break","breakf","breakfa","breakfas","breakfast","l","lu","lun","lunc","lunch","d","di","din","dinn","dinne","dinner"}), is("breakfast"));
        Assert.assertThat(longest.longestWord(new String[]{"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"}), is("latte"));
    }
}