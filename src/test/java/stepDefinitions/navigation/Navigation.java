package stepDefinitions.navigation;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import stepDefinitions.StepDefinitions;

public class Navigation extends StepDefinitions {

    @Given("^I log in$")
    public void iLogIn() throws Throwable {
        loginPage.navigateToLoginPage();
        loginPage.enterValidUsername("standard_user");
        loginPage.enterValidPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @When("^I click the 'Menu' button on the 'Home' page$")
    public void iClickTheMenuButtonOnTheHomePage() throws Throwable {
        homePage.clickMenuButton();
    }

    @And("^I click the 'Logout' button$")
    public void iClickTheLogoutButton() throws Throwable {
        homePage.clickLogoutButton();
    }

    @Then("^I am logged out$")
    public void iAmLoggedOut() throws Throwable {
        Assert.assertTrue(loginPage.iAmOnTheLoginPage());
    }
}
