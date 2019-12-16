package co.com.theninjastore.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/register_new_user.feature",
		glue = "co.com.theninjastore.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)

public class RegisterNewUser {
}
