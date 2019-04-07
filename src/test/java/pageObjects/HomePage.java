package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
    @FindBy(id = "shopping_cart_container")
    private WebElement HomePageIdentifier;
    @FindBy(xpath = "//*[@id=\"menu_button_container\"]/div/div[3]/div/button")
    private WebElement MenuButton;
    @FindBy(id = "logout_sidebar_link")
    private WebElement LogoutButton;

    public boolean iAmOnTheHomePage() {
        return HomePageIdentifier.isDisplayed();
    }

    public void clickMenuButton() {
        MenuButton.click();
        //click(MenuButton);
    }

    public void clickLogoutButton() {
        waitForTheElementToBeClickable(LogoutButton);
        LogoutButton.click();
        //click(LogoutButton);

    }
}
