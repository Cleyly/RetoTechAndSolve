package co.com.theninjastore.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/add_article_to_wish_list.feature",
		glue = "co.com.theninjastore.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)

public class AddArticleToWishList {
}
