package stepDefinitions.account;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import stepDefinitions.StepDefinitions;

public class Login extends StepDefinitions {

    @Given("^I am on the 'Login' page$")
    public void iAmOnTheLoginPage(){
          loginPage.navigateToLoginPage();
    }

    /*@When("^I enter a valid username in the 'Username' textbox on the 'Login' page$")
    public void iEnterAValidUsernameInTheUsernameTextboxOnTheLoginPage() throws Throwable {
        loginPage.enterValidUsername(validUserName);
    }*/

    /*@And("^I enter a valid password in the 'Password' textbox on the 'Login' page$")
    public void iEnterAValidPasswordInThePasswordTextboxOnTheLoginPagei() throws Throwable {
        loginPage.enterValidPassword(validPassword);
    }*/

    @And("^I click the 'Login' button$")
    public void iClickTheLoginButton() throws Throwable {
        loginPage.clickLoginButton();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() throws Throwable {
        Assert.assertTrue(homePage.iAmOnTheHomePage());
    }

    @When("^I enter a valid <username> in the 'Username' textbox on the 'Login' page$")
    public void iEnterAValidUsernameInTheUsernameTextboxOnTheLoginPage(DataTable table) throws Throwable {
        //System.out.println(table.cell(1,0));
        String validUserName = table.cell(1,0);
        loginPage.enterValidUsername(validUserName);
    }

    @And("^I enter a valid <password> in the 'Password' textbox on the 'Login' page$")
    public void iEnterAValidPasswordInThePasswordTextboxOnTheLoginPage(DataTable table) throws Throwable {
         String validPassword = table.cell(1,0);
        loginPage.enterValidPassword(validPassword);
    }

    @When("^I enter a (.*) in the 'Username' textbox on the 'Login' page$")
    public void iEnterAUsernameInTheUsernameTextboxOnTheLoginPage(String username) throws Throwable {
        loginPage.enterValidUsername(username);
    }

    @And("^I enter a (.*) in the 'Password' textbox on the 'Login' page$")
    public void iEnterAPasswordInThePasswordTextboxOnTheLoginPage(String password) throws Throwable {
        loginPage.enterValidPassword(password);
    }
}
