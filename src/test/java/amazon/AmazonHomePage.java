package amazon;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/")
public class AmazonHomePage extends PageObject {
    public void login() {
        $("#nav-link-accountList").click();
    }

    public String getWelcomeText() {
        String userName=$("a[data-nav-role=\"signin\"] span.nav-line-1").getText();
        return userName;
    }
}


