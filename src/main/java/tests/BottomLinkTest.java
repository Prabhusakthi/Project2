// BottomLinkTest.java
package tests;

import base.BaseTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BottomLinkTest extends BaseTest {
    @Test
    public void testBottomLinks() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        driver.findElement(By.linkText("Careers")).click();
        Assert.assertTrue(driver.getTitle().contains("Careers"), "Page title doesn't match for Careers link");
        tearDown();
    }

	private void navigateToUrl(String string) {
		// TODO Auto-generated method stub
		
	}
}
