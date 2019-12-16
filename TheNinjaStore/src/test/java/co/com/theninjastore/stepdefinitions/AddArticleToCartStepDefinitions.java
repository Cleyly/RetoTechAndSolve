package co.com.theninjastore.stepdefinitions;

import co.com.theninjastore.questions.VerifyArticleAddedToCart;
import co.com.theninjastore.tasks.OpenTheBrowser;
import co.com.theninjastore.userinterfaces.TheNinjaStoreLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static co.com.theninjastore.tasks.AddArticleToCart.QUANTITY;
import static co.com.theninjastore.tasks.AddArticleToCart.toCart;
import static co.com.theninjastore.tasks.Login.login;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class AddArticleToCartStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor Cleyly = Actor.named("Cleyly");

    private TheNinjaStoreLogin theNinjaStoreLogin;

    @Given("^the customer login on the page$")
    public void theCustomerLoginOnThePage() {

        Cleyly.can(BrowseTheWeb.with(herBrowser));

        Cleyly.wasAbleTo(
                OpenTheBrowser.on(theNinjaStoreLogin),
                login()
        );

    }

    @When("^she to add article of 'Phones and PDAs' in the shopping cart$")
    public void sheToAddArticleOfPhonesAndPDAsInTheShoppingCart() {
        Cleyly.attemptsTo(
                toCart()
        );

    }

    @Then("^she should to verify the article added$")
    public void sheShouldToVerifyTheArticleAdded() {
        Cleyly.should(
                seeThat(VerifyArticleAddedToCart.articleInCart(QUANTITY), is(true))

        );

    }
}
