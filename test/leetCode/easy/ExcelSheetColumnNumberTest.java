package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ExcelSheetColumnNumberTest {

    @Test
    public void titleToNumber() {
        ExcelSheetColumnNumber convNum = new ExcelSheetColumnNumber();
        //A : 65, Z: 90
        assertThat(convNum.titleToNumber("A"), is(1));
        assertThat(convNum.titleToNumber("Z"), is(26));
        assertThat(convNum.titleToNumber("AA"), is(27));
        assertThat(convNum.titleToNumber("AB"), is(28));
        assertThat(convNum.titleToNumber("AAA"), is(703));

    }
}