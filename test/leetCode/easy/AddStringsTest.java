package leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AddStringsTest {

    @Test
    void addStrings() {
        AddStrings addStrings = new AddStrings();
        assertThat(addStrings.addStrings("1", "1"), is("2"));
        assertThat(addStrings.addStrings("1234", "1234"), is("2468"));
        assertThat(addStrings.addStrings("6", "8"), is("14"));
        assertThat(addStrings.addStrings("567", "8"), is("575"));
    }
}