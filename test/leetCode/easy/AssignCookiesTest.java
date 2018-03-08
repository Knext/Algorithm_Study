package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AssignCookiesTest {

    @Test
    public void findContentChildren() {
        AssignCookies cookies = new AssignCookies();
        assertThat(cookies.findContentChildren(new int[]{1},new int[]{1}), is(1));
        assertThat(cookies.findContentChildren(new int[]{1,2},new int[]{1,1}), is(1));
        assertThat(cookies.findContentChildren(new int[]{1,2,3},new int[]{1,1,1}), is(1));
        assertThat(cookies.findContentChildren(new int[]{1,2},new int[]{1,2,3}), is(2));
        assertThat(cookies.findContentChildren(new int[]{1},new int[]{1,1,1}), is(1));
        assertThat(cookies.findContentChildren(new int[]{},new int[]{1}), is(0));
        assertThat(cookies.findContentChildren(new int[]{1},new int[]{}), is(0));
    }
}