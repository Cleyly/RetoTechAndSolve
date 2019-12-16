package co.com.theninjastore.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {
	
	private PageObject page;
	
	private OpenTheBrowser(PageObject page) {
		this.page =page;
	}

	@Override
	@Step("{0} opens the browser on The Ninja Store Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Open.browserOn().the(page)
		);
	}

	public static OpenTheBrowser on(PageObject page) {
		return new OpenTheBrowser(page);
	}

}
