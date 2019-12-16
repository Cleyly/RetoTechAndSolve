package co.com.theninjastore.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.theninjastore.userinterfaces.ShoppingCartPage.QUANTITY;

public class VerifyArticleAddedToCart implements Question {

    private String articleAdd;

    public VerifyArticleAddedToCart(String articleAdd) { this.articleAdd = articleAdd; }

    @Override
    public Boolean answeredBy(Actor actor) {
        String articleAdd = QUANTITY.resolveFor(actor).getValue();

        return (articleAdd.equalsIgnoreCase(this.articleAdd));

    }

    public static VerifyArticleAddedToCart articleInCart(String articleAdd) { return new VerifyArticleAddedToCart(articleAdd); }
}
