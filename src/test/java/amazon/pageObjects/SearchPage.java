package amazon.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;


public class SearchPage extends PageObject {
    public void searchFor(String item) {
        $("#twotabsearchtextbox").sendKeys(item, Keys.ENTER);
    }

    public String getItemName() {
        String itemName = $("a.a-link-normal .a-text-normal").getText();
        return itemName;
    }
}
