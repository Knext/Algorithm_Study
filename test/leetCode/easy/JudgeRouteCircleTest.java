package leetCode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JudgeRouteCircleTest {

    @Test
    public void testJudgeCircle() throws Exception {
        JudgeRouteCircle judgeRouteCircle = new JudgeRouteCircle();
        assertEquals(judgeRouteCircle.judgeCircle("UUD"), false);
        assertEquals(judgeRouteCircle.judgeCircle("ULD"), false);
        assertEquals(judgeRouteCircle.judgeCircle("UD"), true);
        assertEquals(judgeRouteCircle.judgeCircle("ULURDD"), true);
        assertEquals(judgeRouteCircle.judgeCircle("LLLL"), false);
        assertEquals(judgeRouteCircle.judgeCircle("RRRRRRDDUU"), false);

    }


} 
