package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class KeyboardTest {

    @Test
    public void testKeyboardTest() throws Exception {
        KeyboardRow keyboardRow = new KeyboardRow();

        assertThat(keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}),
                is(new String[]{"Alaska", "Dad"}));
    }
}
