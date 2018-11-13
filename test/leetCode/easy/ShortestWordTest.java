package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class ShortestWordTest {

    @Test
    void shortestCompletingWord() {
        ShortestWord shortWord = new ShortestWord();
        Assert.assertThat(shortWord.shortestCompletingWord("1s3 PSt",new String[]{"step", "steps", "stripe", "stepple"})
                , is("steps"));
        Assert.assertThat(shortWord.shortestCompletingWord("1s3 456",new String[]{"looks", "pest", "stew", "show"})
                , is("pest"));
    }
}