package com.magneto365.automation.stepdefinitions;

import com.magneto365.automation.models.Data;
import com.magneto365.automation.questions.QuestionValidateNameUser;
import com.magneto365.automation.tasks.EnterLogin;
import com.magneto365.automation.tasks.EnterWithUser;
import com.magneto365.automation.userinterfaces.MagnetoPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;

public class LoginMagnetoStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor isabo = Actor.named("Isabo");

    @Before
    public void setUp(){
        isabo.can(BrowseTheWeb.with(hisBrowser));
        isabo.wasAbleTo(Open.browserOn(new MagnetoPage()));
    }

    @Given("^the entry to the magnet page, I select the option enter$")
    public void theEntryToTheMagnetPageISelectTheOptionEnter() {
        isabo.attemptsTo(EnterLogin.theEnterLogin());
    }

    @When("^I add the email and password$")
    public void iAddTheEmailAndPassword(List<Data> dataList) {
       isabo.attemptsTo(EnterWithUser.theLoginUser(dataList.get(0)));
    }

    @Then("^valid my name$")
    public void validMyName(List<Data> dataList) {
        isabo.should(seeThat(QuestionValidateNameUser.questionValidateNameUser(dataList.get(0))));

    }
}
