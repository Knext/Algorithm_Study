package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumProductTest {

    @Test
    public void maximumProduct() {
        MaximumProduct maximumProduct = new MaximumProduct();
        assertThat(maximumProduct.maximumProduct(new int[]{0,1,2}), is(0));
        assertThat(maximumProduct.maximumProduct(new int[]{1,2,3}), is(6));
        assertThat(maximumProduct.maximumProduct(new int[]{1,2,3,4}), is(24));
        assertThat(maximumProduct.maximumProduct(new int[]{-4,-3,1,2}), is(24));
        assertThat(maximumProduct.maximumProduct(new int[]{-4,-3,-2,1}), is(12));
    }
}