package leetCode.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SelfDividingNumbersTest {

    @Test
    public void testSelfDividingNumbers() throws Exception {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();

        List<Integer> result = selfDividingNumbers.selfDividingNumbers(1, 22);
        System.out.println(result);
        assertThat(result.size(), is(13));

        result = selfDividingNumbers.selfDividingNumbers(1, 10);
        System.out.println(result);
        assertThat(result.size(), is(9));
    }
}
