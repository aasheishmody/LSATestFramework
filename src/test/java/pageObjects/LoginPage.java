package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.Webconnector.getBaseURL;
import static util.Webconnector.getDriver;

public class LoginPage extends Page {
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    private WebElement UsernameTextbox;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement PasswordTextbox;
    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/input[3]")
    private WebElement LoginButton;

    private String loginPageURL = getBaseURL();

    public void navigateToLoginPage() {
        getDriver().get(loginPageURL);
    }

    public void enterValidUsername(String validUserName) {
        UsernameTextbox.sendKeys(validUserName);
    }

    public void enterValidPassword(String validPassword) {
        PasswordTextbox.sendKeys(validPassword);
    }

    public void clickLoginButton() {
        LoginButton.click();
    }

    public boolean iAmOnTheLoginPage() {
        return UsernameTextbox.isDisplayed();
    }
}
