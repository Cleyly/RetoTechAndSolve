package co.com.theninjastore.tasks;

import static co.com.theninjastore.userinterfaces.AddArticleToCart.*;
import static co.com.theninjastore.userinterfaces.ShoppingCartPage.SHOPPING_CART;

import co.com.theninjastore.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddArticleToCart implements Task {

	public static final String QUANTITY = "1";

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PHONES_AND_PDAS),
				Click.on(ADD_TO_CART),
				Click.on(SHOPPING_CART),
				Enter.theValue(QUANTITY).into(ShoppingCartPage.QUANTITY)

		);

	}

	public static AddArticleToCart toCart() { return new AddArticleToCart(); }

}
