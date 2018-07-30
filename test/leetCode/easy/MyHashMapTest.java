package leetCode.easy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;


public class MyHashMapTest {

    private MyHashMap map;

    @Before
    public void setup() {
        map = new MyHashMap();
    }

    @After
    public void tearDown() {
        map = null;
    }

    @Test
    public void test2() {
        for (int i = 0; i < 1000000; i++) {
            map.put(i,i);
        }
        Assert.assertThat(map.get(100), is(100));

        map.remove(100);
        Assert.assertThat(map.get(100), is(-1));
    }

    @Test
    public void test() {
        map.put(1, 1);
        map.put(2, 2);
        Assert.assertThat(map.get(1), is(1));
        Assert.assertThat(map.get(3), is(-1));
        map.put(2, 1);          // update the existing value
        Assert.assertThat(map.get(2), is(1));
        map.remove(2);          // remove the mapping for 2
        Assert.assertThat(map.get(2), is(-1));
    }

    @Test
    public void testMinus() {
        map.put(-1,1);
        Assert.assertThat(map.get(-1), is(-1));
    }

    @Test
    public void testOverRange() {
        map.put(1000001,1);
        Assert.assertThat(map.get(1000001), is(-1));
    }

    //All keys and values will be in the range of [0, 1000000].
    //The number of operations will be in the range of [1, 10000].
}