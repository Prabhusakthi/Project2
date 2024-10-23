// LoginTest.java
package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testSignUp() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signUp("testemail@example.com", "testpassword");
        // Validate successful sign-up (e.g., check for a welcome message or redirected page)
        Assert.assertTrue(driver.getTitle().contains("Account"), "Sign-up failed");
        tearDown();
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalidemail@example.com", "wrongpassword");
        // Validate unsuccessful login (e.g., check for an error message)
        Assert.assertTrue(driver.getPageSource().contains("incorrect"), "Error message not displayed");
        tearDown();
    }

private void navigateToUrl(String string) {
	// TODO Auto-generated method stub
	
}}
