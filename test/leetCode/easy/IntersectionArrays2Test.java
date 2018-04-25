package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntersectionArrays2Test {

    @Test
    public void intersect() {
        IntersectionArrays2 interArray = new IntersectionArrays2();
        assertThat(interArray.intersect(new int[]{1,2,2,1},new int[]{2,2}), is(new int[]{2,2}));
    }
}