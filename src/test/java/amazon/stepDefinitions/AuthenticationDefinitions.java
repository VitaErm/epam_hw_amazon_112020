package amazon.stepDefinitions;

import amazon.pageObjects.AmazonHomePage;
import amazon.pageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AuthenticationDefinitions {
    AmazonHomePage amazonHomePage = new AmazonHomePage();
    LoginPage loginPage = new LoginPage();

    @Given("I am on Amazon Homepage")
    public void iAmOnAmazonHomepage() {
        amazonHomePage.open();

    }

    @And("I choose to login")
    public void iClick() {
        amazonHomePage.login();
    }

    @When("I fill in Email with {string}")
    public void iFillIEmailnWith(String email) {

        loginPage.fillEmailField(email);
    }

    @And("I click on continue")
    public void iPress() {
        loginPage.clickContinue();
    }

    @And("I fill in Password with {string}")
    public void iFillIPWnWith(String password) {
        loginPage.fillPWField(password);
    }

    @And("I press sign in")
    public void iPressSignIn() {
        loginPage.clickSignIn();
    }

    @Then("I should be greeted with {string} on Amazon homepage")
    public void iShouldBeOnTheUsersHomePage(String welcomeMessage) {
        Assert.assertEquals(welcomeMessage, amazonHomePage.getWelcomeText());
    }
}
