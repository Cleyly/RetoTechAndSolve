package co.com.theninjastore.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.theninjastore.userinterfaces.WishListPage.PRODUCT_NAME;
import static co.com.theninjastore.userinterfaces.WishListPage.WISH_LIST;

public class VerifyArticleAddedWishList implements Question {

    private String nameArticleAddedWishList;

    public VerifyArticleAddedWishList(String articleAddWishList) { this.nameArticleAddedWishList = articleAddWishList; }


    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Click.on(WISH_LIST)
        );

        String nameArticleAddedWishList = Text.of(PRODUCT_NAME).viewedBy(actor).asString();

        return nameArticleAddedWishList.equalsIgnoreCase(this.nameArticleAddedWishList);

    }

    public static VerifyArticleAddedWishList articleWish(String nameArticleAddedWishList) { return new VerifyArticleAddedWishList(nameArticleAddedWishList); }
}
