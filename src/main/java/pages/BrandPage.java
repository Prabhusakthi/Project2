// BrandsPage.java
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandPage {
    WebDriver driver;

    @FindBy(linkText = "Brands")
    WebElement brandsLink;

    @FindBy(linkText = "Apple")
    WebElement appleBrand;

    @FindBy(xpath = "//button[@class='addToCartButton']")
    WebElement addToCartButton;

    public BrandPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectBrandAndAddItem() {
        brandsLink.click();
        appleBrand.click();
        addToCartButton.click();
    }
}

