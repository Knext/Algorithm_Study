package leetCode.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IslandPerimeterTest {

    @Test
    public void testIslandPerimeterTest() throws Exception {

        IslandPerimeter islandPerimeter = new IslandPerimeter();

        assertThat(islandPerimeter.islandPerimeter(
                new int [][]{
                        {1}}),
                is(4));

        assertThat(islandPerimeter.islandPerimeter(
                new int [][]{
                        {0,1},
                        {0,1}}),
                is(6));

        assertThat(islandPerimeter.islandPerimeter(
                new int [][]{
                        {0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}}),
                is(16));
    }
}
