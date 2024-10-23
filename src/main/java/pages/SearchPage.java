// SearchPage.java
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    @FindBy(id = "searchInput")
    WebElement searchInput;

    @FindBy(id = "searchButton")
    WebElement searchButton;

    @FindBy(xpath = "//button[@class='addToCartButton']")
    WebElement addToCartButton;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchAndAddToCart(String item) {
        searchInput.sendKeys(item);
        searchButton.click();
        addToCartButton.click();
    }
}
