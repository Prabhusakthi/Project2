// CloseBrowserTest.java
package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class CloseBrowserTest extends BaseTest {
    @Test
    public void testCloseBrowser() {
        setUp();
        navigateToUrl("https://www.bestbuy.com/");
        tearDown();
    }

	private void navigateToUrl(String string) {
		// TODO Auto-generated method stub
		
	}
}

