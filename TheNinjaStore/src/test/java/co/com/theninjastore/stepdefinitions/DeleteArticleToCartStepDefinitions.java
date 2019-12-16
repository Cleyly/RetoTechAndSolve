package co.com.theninjastore.stepdefinitions;

import co.com.theninjastore.questions.VerifyArticleDeletedToCart;
import co.com.theninjastore.tasks.AddArticleToCart;
import co.com.theninjastore.tasks.OpenTheBrowser;
import co.com.theninjastore.userinterfaces.TheNinjaStoreLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static co.com.theninjastore.tasks.DeleteArticleToCart.deleteArticle;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class DeleteArticleToCartStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor Cleyly = Actor.named("Cleyly");

    private TheNinjaStoreLogin theNinjaStoreLogin;


    @Given("^the customer added articles on the shopping cart$")
    public void theCustomerAddedArticlesOnTheShoppingCart() {
        Cleyly.can(BrowseTheWeb.with(herBrowser));

        Cleyly.wasAbleTo(
                OpenTheBrowser.on(theNinjaStoreLogin),
                AddArticleToCart.toCart()

        );
    }

    @When("^she delete article of the shopping cart$")
    public void sheDeleteArticleOfTheShoppingCart() {
        Cleyly.attemptsTo(
                deleteArticle()

        );

    }

    @Then("^she should see an empty shopping cart$")
    public void sheShouldSeeAnEmptyShoppingCart() {
        Cleyly.should(
                seeThat(VerifyArticleDeletedToCart.cartEmpty())

        );

    }
}
