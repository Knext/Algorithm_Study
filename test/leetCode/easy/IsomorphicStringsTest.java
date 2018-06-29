package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void isIsomorphic() {
        IsomorphicStrings isomorphic = new IsomorphicStrings();
        Assert.assertThat(isomorphic.isIsomorphic("a","b"), is(true));
        Assert.assertThat(isomorphic.isIsomorphic("ab","aa"), is(false));
        Assert.assertThat(isomorphic.isIsomorphic("egg","add"), is(true));
        Assert.assertThat(isomorphic.isIsomorphic("foo","bar"), is(false));
        Assert.assertThat(isomorphic.isIsomorphic("title","paper"), is(true));
    }
}