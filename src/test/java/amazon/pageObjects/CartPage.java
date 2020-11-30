package amazon.pageObjects;

import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {
    public String getCartStatus(){
        String cartStatus= $("#attachDisplayAddBaseAlert .a-alert-heading").getText();
        return cartStatus;
    }
}

