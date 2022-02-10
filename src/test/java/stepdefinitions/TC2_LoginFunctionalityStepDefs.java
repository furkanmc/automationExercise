package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC02_LoginPage;

import java.util.List;

public class TC2_LoginFunctionalityStepDefs {
TC02_LoginPage loginPage = new TC02_LoginPage();
    @When("user verifies login to your account is visible")
    public void user_verifies_login_to_your_account_is_visible() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }

    @And("user enters correct email_address and password")
    public void userEntersCorrectEmail_addressAndPassword(DataTable credentials) {
        List<String> loginCredentials = credentials.row(1);
        loginPage.emailBox.sendKeys(loginCredentials.get(0));
        loginPage.emailBox.sendKeys(loginCredentials.get(1));
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {

    }
    @Then("user verifies logged in as username is visible")
    public void user_verifies_logged_in_as_username_is_visible() {

    }

}