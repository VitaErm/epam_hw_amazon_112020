package amazon;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;

public class LoginPage extends PageObject {
    public void fillEmailField(String email) {
        $("#ap_email").sendKeys(email);
    }

    public void clickContinue() {
        $("#continue").click();
    }

    public void clickSignIn() {
        $("#signInSubmit.a-button-input").click();
    }

    public void fillPWField(String pw) {
        $("#ap_password").sendKeys(pw);
    }
}