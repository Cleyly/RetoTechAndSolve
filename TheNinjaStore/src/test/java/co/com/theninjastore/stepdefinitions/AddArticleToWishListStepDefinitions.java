package co.com.theninjastore.stepdefinitions;

import co.com.theninjastore.questions.VerifyArticleAddedWishList;
import co.com.theninjastore.tasks.OpenTheBrowser;
import co.com.theninjastore.userinterfaces.TheNinjaStoreLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static co.com.theninjastore.tasks.AddToWishList.toWishList;
import static co.com.theninjastore.tasks.Login.login;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class AddArticleToWishListStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor Cleyly = Actor.named("Cleyly");

    private TheNinjaStoreLogin theNinjaStoreLogin;


    @Given("^the customer add article in the wish list$")
    public void theCustomerAddArticleInTheWishList() {

        Cleyly.can(BrowseTheWeb.with(herBrowser));

        Cleyly.wasAbleTo(
                OpenTheBrowser.on(theNinjaStoreLogin),
                login()

        );

    }

    @When("^she to verify on the wish list$")
    public void sheToVerifyOnTheWishList() {
        Cleyly.attemptsTo(
                toWishList()

        );

    }

    @Then("^she should see the article '(.*)' added$")
    public void sheShouldSeeTheArticleAdded(String productName) {
        Cleyly.should(
                seeThat(VerifyArticleAddedWishList.articleWish(productName), is(true))
        );

    }
}
