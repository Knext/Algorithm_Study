package leetCode.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FindAllNumbersDisappearedInArrayTest {

    @Test
    public void test_findDisappearedNumbers() {
        FindAllNumbersDisappearedInArray findAll = new FindAllNumbersDisappearedInArray();
        assertThat(findAll.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}), is(Arrays.asList(5,6)));
    }
}