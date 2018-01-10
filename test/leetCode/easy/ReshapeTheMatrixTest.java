package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReshapeTheMatrixTest {

    @Test
    public void testReshapeTheMatrixTest() throws Exception {

        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();

        assertThat(reshapeTheMatrix.matrixReshape(new int[][] {{1,2},{3,4}}, 2, 4),
                is(new int[][] {{1,2},{3,4}}));

        assertThat(reshapeTheMatrix.matrixReshape(new int[][] {{1,2},{3,4}}, 1, 4),
                is(new int[][]{{1,2,3,4}}));

        assertThat(reshapeTheMatrix.matrixReshape(new int[][] {{1,2,3},{4,5,6}}, 3, 2),
                is(new int[][]{{1,2},{3,4},{5,6}}));

        assertThat(reshapeTheMatrix.matrixReshape(new int[][] {{1,2,3},{4,5,6}}, 1, 6),
                is(new int[][]{{1,2,3,4,5,6}}));


    }

}
