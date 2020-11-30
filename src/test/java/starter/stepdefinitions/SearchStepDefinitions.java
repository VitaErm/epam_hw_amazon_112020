package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class SearchStepDefinitions {
    static Target Wikipedia_SEARCH_FIELD = Target
            .the("search field")
            .locatedBy("#searchInput");

    static Target Wikipedia_Article_HEADING =  Target
            .the("article heading")
            .locatedBy("#firstHeading");

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(Task.where("{0} opens the Wikipedia home page",
                Open.url("https://wikipedia.org")));
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String searchTerm) {
        actor.attemptsTo(Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(Wikipedia_SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
                )
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(Wikipedia_Article_HEADING).hasText(term)
        );
    }


}
