// BrandsTest.java
package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrandPage;

public class BrandTest extends BaseTest {
    @Test
    public void testSelectBrandAndAddItem() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        BrandPage brandsPage = new BrandPage(driver);
        brandsPage.selectBrandAndAddItem();
        // Validate successful addition to cart
        Assert.assertTrue(driver.getPageSource().contains("added to cart"), "Item not added to cart");
        tearDown();
    }

	private void navigateToUrl(String string) {
		// TODO Auto-generated method stub
		
	}
}

