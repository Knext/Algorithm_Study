package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BaseballGameTest {

    @Test
    public void testBaseBallGameTest() throws Exception {
        BaseballGame baseBallGame = new BaseballGame();

        assertThat(baseBallGame.calPoints(new String[]{"5","2","C","D","+"}), is(30));
        assertThat(baseBallGame.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}), is(27));
    }
}
