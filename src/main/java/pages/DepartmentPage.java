// DepartmentPage.java
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPage {
    WebDriver driver;

    @FindBy(linkText = "Shop by Department")
    WebElement shopByDepartment;

    @FindBy(linkText = "Laptops")
    WebElement laptopsLink;

    @FindBy(xpath = "//button[@class='addToCartButton']")
    WebElement addToCartButton;

    public DepartmentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectDepartmentAndAddItem() {
        shopByDepartment.click();
        laptopsLink.click();
        addToCartButton.click();
    }
}

