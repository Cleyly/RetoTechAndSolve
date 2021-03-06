package co.com.theninjastore.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/delete_article_to_cart.feature",
		glue = "co.com.theninjastore.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)

public class DeleteArticleToCartToCart {
}
