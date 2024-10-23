// ScreenshotTest.java
package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import utils.ScreenshotUtils;

public class ScreenshotTest extends BaseTest {
    @Test
    public void testCaptureScreenshot() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        ScreenshotUtils.takeScreenshot(driver, "screenshots/homepage.png");
        tearDown();
    }

private void navigateToUrl(String string) {
	// TODO Auto-generated method stub
	
}}
