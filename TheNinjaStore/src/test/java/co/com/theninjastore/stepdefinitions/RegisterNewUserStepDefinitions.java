package co.com.theninjastore.stepdefinitions;

import co.com.theninjastore.questions.VerifyNewRegister;
import co.com.theninjastore.tasks.OpenTheBrowser;
import co.com.theninjastore.userinterfaces.TheNinjaStoreRegister;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static co.com.theninjastore.tasks.CreateNewUser.goToRegister;
import static co.com.theninjastore.tasks.RegisterNewUser.FIRST_NAME;
import static co.com.theninjastore.tasks.RegisterNewUser.fillFields;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class RegisterNewUserStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor Cleyly = Actor.named("Cleyly");
	
	private TheNinjaStoreRegister theNinjaStoreRegister;


	@Given("^the customer enters the page$")
	public void theCustomerEntersThePage() {

		Cleyly.can(BrowseTheWeb.with(herBrowser));

		Cleyly.wasAbleTo(
				OpenTheBrowser.on(theNinjaStoreRegister),
				goToRegister()
		);

	}

	@When("^she register the new user$")
	public void sheRegisterTheNewUser() {
		Cleyly.attemptsTo(
				fillFields()
		);

	}

	@Then("^she should to verify the account has been created$")
	public void sheShouldToVerifyTheAccountHasBeenCreatedT(){
		Cleyly.should(
				seeThat(VerifyNewRegister.verifyName(FIRST_NAME), is(true))
		);

	}

}
