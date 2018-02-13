package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ConstructRectangleTest {

    @Test
    public void constructRectangle() {
        ConstructRectangle conRect = new ConstructRectangle();
        assertThat(conRect.constructRectangle(4), is(new int[]{2,2}));
        assertThat(conRect.constructRectangle(5), is(new int[]{5,1}));
        assertThat(conRect.constructRectangle(8), is(new int[]{4,2}));
    }
}