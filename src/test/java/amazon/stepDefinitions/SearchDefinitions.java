package amazon.stepDefinitions;

import amazon.pageObjects.AmazonHomePage;
import amazon.pageObjects.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchDefinitions {
    AmazonHomePage amazonHomePage = new AmazonHomePage();
    SearchPage searchPage = new SearchPage();

    @Given("I am on Amazon Homepage for search")
    public void iAmOnAmazonHomepageForSearch() {
        amazonHomePage.open();
    }

    @When("I fill in Search Field {string}")
    public void iFillInSearchField(String item) {
        searchPage.searchFor(item);
    }

    @Then("I see items with name {string}")
    public void iSeeItemsWithName(String item) {
        Assert.assertTrue("No items matching text: " + item,
                searchPage.getItemName().toLowerCase().contains(item.toLowerCase()));
    }
}
