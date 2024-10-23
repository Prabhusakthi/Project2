// CheckoutPage.java
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(id = "proceedToCheckout")
    WebElement proceedToCheckoutButton;

    @FindBy(id = "paymentMethod")
    WebElement paymentMethodInput;

    @FindBy(id = "placeOrderButton")
    WebElement placeOrderButton;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void proceedToCheckoutAndPay() {
        proceedToCheckoutButton.click();
        paymentMethodInput.sendKeys("4111111111111111"); // Dummy card number
        placeOrderButton.click();
    }

	public boolean verifyOrderConfirmation() {
		// TODO Auto-generated method stub
		return false;
	}
}

