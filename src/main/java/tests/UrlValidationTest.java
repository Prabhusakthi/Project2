// UrlValidationTest.java
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.UrlUtils;

public class UrlValidationTest {
    @Test
    public void testValidUrl() {
        boolean isBroken = UrlUtils.isUrlBroken("https://www.bestbuy.com/");
        Assert.assertFalse(isBroken, "URL is broken");
    }

    @Test
    public void testBrokenUrl() {
        boolean isBroken = UrlUtils.isUrlBroken("https://www.invalidbestbuy.com/");
        Assert.assertTrue(isBroken, "URL is not broken as expected");
    }
}
