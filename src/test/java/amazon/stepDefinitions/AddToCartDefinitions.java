package amazon.stepDefinitions;

import amazon.pageObjects.CartPage;
import amazon.pageObjects.MonopolyGamePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddToCartDefinitions {
    MonopolyGamePage monopolyGamePage=new MonopolyGamePage();
    CartPage cartPage=new CartPage();
    @Given("I am on page with Monopoly Game")
    public void iAmOnPageWithMonopolyGame() {
        monopolyGamePage.open();
    }

    @When("I click on button Add to Cart")
    public void iClickOnButtonAddToCart() {
        monopolyGamePage.addToCart();
    }

    @Then("I see status cart {string}")
    public void iSeeStatusCart(String cartStatus) throws InterruptedException {
        // Temporary solution to wait for add operation to complete asynchronously
        Thread.sleep(2000);

        Assert.assertEquals(cartStatus,cartPage.getCartStatus());
    }
}
