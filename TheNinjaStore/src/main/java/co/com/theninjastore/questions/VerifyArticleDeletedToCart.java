package co.com.theninjastore.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.theninjastore.userinterfaces.DeleteArticleToCart.MESSAGE_CART_EMPTY;



public class VerifyArticleDeletedToCart implements Question {

    private String delete;




    @Override
    public Boolean answeredBy(Actor actor) {

      return Visibility.of(MESSAGE_CART_EMPTY).viewedBy(actor).asBoolean();

    }
    public static VerifyArticleDeletedToCart cartEmpty() { return new VerifyArticleDeletedToCart(); }

    }
