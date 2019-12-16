package co.com.theninjastore.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.theninjastore.userinterfaces.DeleteArticleToCart.REMOVE;
import static co.com.theninjastore.userinterfaces.DeleteArticleToCart.SHOPPING_CART;

public class DeleteArticleToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SHOPPING_CART),
                Click.on(REMOVE)

        );
    }

    public static DeleteArticleToCart deleteArticle() { return new DeleteArticleToCart(); }

}
