package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaxAreaOfIslandTest {

    @Test
    public void testMaxAreaOfIsland() throws Exception {

        MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
        assertThat(maxAreaOfIsland.maxAreaOfIsland(
                new int [][]{{1,1},
                             {1,1}}), is(4));
        assertThat(maxAreaOfIsland.maxAreaOfIsland(
                new int [][]{{0,1,0},
                             {0,1,1}
                            ,{1,0,0}}), is(3));
        assertThat(maxAreaOfIsland.maxAreaOfIsland(
                new int [][]{{1,1,0,0,0},
                             {1,1,0,0,0},
                             {0,0,0,1,1},
                             {0,0,0,1,1}}), is(4));
        int map[][] = new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        assertThat(maxAreaOfIsland.maxAreaOfIsland(map), is(6));
        assertThat(maxAreaOfIsland.maxAreaOfIsland(new int [][]{{0,0,0,0,0,0,0,0}}), is(0));
    }
}
