package stepDefinitions;

import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import static util.Webconnector.getDriver;

public abstract class StepDefinitions {
    public HomePage homePage;
    public LoginPage loginPage;


    public StepDefinitions() {
        homePage = PageFactory.initElements(getDriver(), HomePage.class);
        loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    }

}