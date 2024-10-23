// DepartmentTest.java
package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DepartmentPage;

public class DepartmentTest extends BaseTest {
    @Test
    public void testSelectDepartmentAndAddItem() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        DepartmentPage departmentPage = new DepartmentPage(driver);
        departmentPage.selectDepartmentAndAddItem();
        // Validate successful addition to cart
        Assert.assertTrue(driver.getPageSource().contains("added to cart"), "Item not added to cart");
        tearDown();
    }


private void navigateToUrl(String string) {
	// TODO Auto-generated method stub
	
}}