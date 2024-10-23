// CheckoutTest.java
package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {
    @Test
    public void testCheckoutAndPayment() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedToCheckoutAndPay();
        // Validate successful order placement
        Assert.assertTrue(driver.getPageSource().contains("Order Confirmation"), "Order was not placed successfully");
        tearDown();
    }
    private void navigateToUrl(String string) {
		// TODO Auto-generated method stub
		
	}
	@Test
    public void testOrderWithInvalidCard() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedToCheckoutAndPay(); // Invalid card number
        Assert.assertFalse(checkoutPage.verifyOrderConfirmation(), "Order confirmation should not be displayed for invalid payment.");
        tearDown();
    }

}
