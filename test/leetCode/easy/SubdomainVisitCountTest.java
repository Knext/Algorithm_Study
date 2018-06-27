package leetCode.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.hamcrest.CoreMatchers.is;

class SubdomainVisitCountTest {

    @Test
    void subdomainVisits() {
        SubdomainVisitCount sub = new SubdomainVisitCount();
        Assert.assertThat(sub.subdomainVisits(new String[]{"9001 discuss.leetcode.com"}),
                is(Arrays.asList("9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com")));

        Assert.assertThat(sub.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}),
                is(Arrays.asList("901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com")));
    }
}