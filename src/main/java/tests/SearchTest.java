// SearchTest.java
package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends BaseTest {
    @Test
    public void testSearchAndAddToCart() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchAndAddToCart("laptop");
        Assert.assertTrue(driver.getPageSource().contains("added to cart"), "Item not added to cart");
        tearDown();
    }

private void navigateToUrl(String string) {
	// TODO Auto-generated method stub
	
}}
