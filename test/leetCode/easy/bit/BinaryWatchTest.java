package leetCode.easy.bit;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinaryWatchTest {

    @Test
    public void readBinaryWatch() {
        BinaryWatch binaryWatch = new BinaryWatch();
        assertThat(binaryWatch.readBinaryWatch(1),
                is(Arrays.asList("0:01", "0:02", "0:04", "0:08", "0:16", "0:32","1:00", "2:00", "4:00", "8:00")));
        assertThat(binaryWatch.readBinaryWatch(0),
                is(Arrays.asList("0:00")));
    }
}