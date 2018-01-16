package leetCode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NimGameTest {

    @Test
    public void testNimGame() throws Exception {
        NimGame nimGame = new NimGame();

        assertEquals(nimGame.canWinNim(1), true);
        assertEquals(nimGame.canWinNim(2), true);
        assertEquals(nimGame.canWinNim(3), true);
        assertEquals(nimGame.canWinNim(4), false);
        assertEquals(nimGame.canWinNim(5), true); //1제시
        assertEquals(nimGame.canWinNim(6), true); //2제시
        assertEquals(nimGame.canWinNim(7), true); //3제시
        assertEquals(nimGame.canWinNim(8), false); //3제시
    }
}
