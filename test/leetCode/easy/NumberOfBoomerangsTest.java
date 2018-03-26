package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NumberOfBoomerangsTest {

    @Test
    public void numberOfBoomerangs() {
        NumberOfBoomerangs boomerangs = new NumberOfBoomerangs();
        assertThat(boomerangs.numberOfBoomerangs(new int[][]{{0,0},{1,0},{2,0}}), is(2));
    }

    @Test
    public void numberOfBoomerangs3() {
        NumberOfBoomerangs boomerangs = new NumberOfBoomerangs();
        assertThat(boomerangs.numberOfBoomerangs(new int[][]{{0,0},{1,0},{1,1},{0,1}}), is(8));
    }

    @Test
    public void numberOfBoomerangs2() {
        NumberOfBoomerangs boomerangs = new NumberOfBoomerangs();
        assertThat(boomerangs.numberOfBoomerangs(new int[][]{{0,0},{1,0},{-1,0},{0,1},{0,-1}}), is(20));
    }
}