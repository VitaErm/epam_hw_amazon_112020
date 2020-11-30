package amazon.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/dp/B01MU9K3XU/")
public class MonopolyGamePage extends PageObject {
    public void addToCart(){
        $("#add-to-cart-button").click();
    }
}
