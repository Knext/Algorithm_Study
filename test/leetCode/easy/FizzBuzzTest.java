package leetCode.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzTest() throws Exception {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(15),
                is(Arrays.asList("1",
                        "2",
                        "Fizz",
                        "4",
                        "Buzz",
                        "Fizz",
                        "7",
                        "8",
                        "Fizz",
                        "Buzz",
                        "11",
                        "Fizz",
                        "13",
                        "14",
                        "FizzBuzz")));
    }
}
