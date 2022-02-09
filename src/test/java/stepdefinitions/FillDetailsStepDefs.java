package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FillDetailsPage;
import utilities.Driver;

public class FillDetailsStepDefs {

    FillDetailsPage fillDetailsPage = new FillDetailsPage();
    Faker faker = new Faker();

    @When("user fills details")
    public void user_fills_details() {
    fillDetailsPage.genderBox.click();
    fillDetailsPage.passwordBox.sendKeys("Asd123.");
        Driver.selectByIndex(fillDetailsPage.dayDropdown,5);
        Driver.selectByIndex(fillDetailsPage.monthDropdown,4);
        Driver.selectByIndex(fillDetailsPage.yearDropdown,25);

    }
    @When("user selects checkbox signup for our newslater")
    public void user_selects_checkbox_signup_for_our_newslater() {
    fillDetailsPage.newsletterSignupBox.click();
    }
    @When("user selects checkbox receive special offers")
    public void user_selects_checkbox_receive_special_offers() {
    fillDetailsPage.specialOfferBox.click();
    }
    @When("user fills details2")
    public void user_fills_details2() {
    fillDetailsPage.firstNameBox.sendKeys("haci");
    fillDetailsPage.lastNameBox.sendKeys(faker.name().lastName());
    fillDetailsPage.companyBox.sendKeys("techPro");
    fillDetailsPage.addressBox.sendKeys(faker.address().streetAddress());
    fillDetailsPage.stateBox.sendKeys(faker.address().state());
    fillDetailsPage.cityBox.sendKeys(faker.address().city());
    fillDetailsPage.zipcodeBox.sendKeys(faker.address().zipCode());
    fillDetailsPage.mobileNumberBox.sendKeys(faker.phoneNumber().cellPhone());
    }
    @When("user clicks create account button")
    public void user_clicks_create_account_button() {
    fillDetailsPage.createAccountButton.click();
    }
    @Then("user verifies that acount is created")
    public void user_verifies_that_acount_is_created() {
        Assert.assertTrue(fillDetailsPage.verifySignupText.isDisplayed());
    }

    @When("user clicks continue button")
    public void userClicksContinueButton() {
        fillDetailsPage.continueButton.click();
    }

    @And("user verifies that logged in")
    public void userVerifiesThatLoggedIn() {

    }

    @And("user clicks delete account button")
    public void userClicksDeleteAccountButton() {
    }

    @Then("user verifies that acount deleted")
    public void userVerifiesThatAcountDeleted() {
    }
}
