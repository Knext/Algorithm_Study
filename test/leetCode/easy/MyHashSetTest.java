package leetCode.easy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MyHashSetTest {
    private MyHashSet set;

    @Before
    public void setup() {
        set = new MyHashSet();
    }

    @After
    public void tearDown() {
        set = null;
    }

    @Test
    public void test2() {
        for (int i = 0; i < 1000000; i++) {
            set.add(i);
        }
        Assert.assertThat(set.contains(123), is(true));

        set.remove(123);
        Assert.assertThat(set.contains(123), is(false));

        Assert.assertThat(set.contains(123456), is(true));

        set.remove(123456);
        Assert.assertThat(set.contains(123456), is(false));
    }

    @Test
    public void test() {
        set.add(1);
        set.add(2);
        Assert.assertThat(set.contains(1), is(true));
        Assert.assertThat(set.contains(3), is(false));
        set.add(2);          // add again, the existing key
        Assert.assertThat(set.contains(2), is(true));
        set.remove(2);          // remove the mapping for 2
        Assert.assertThat(set.contains(2), is(false));
    }
}