// LoginPage.java
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "signInButton")
    WebElement signInButton;

    @FindBy(id = "signUpLink")
    WebElement signUpLink;

    @FindBy(id = "createAccountButton")
    WebElement createAccountButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signUp(String email, String password) {
        signUpLink.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        createAccountButton.click();
    }

    public void login(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.click();
    }
}

