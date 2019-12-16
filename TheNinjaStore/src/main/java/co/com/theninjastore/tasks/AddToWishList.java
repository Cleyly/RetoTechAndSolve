package co.com.theninjastore.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.theninjastore.userinterfaces.AddArticleToWishList.*;

public class AddToWishList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PHONES_AND_PDAS),
                Click.on(BUTTON_WISH_LIST)

        );
    }


    public static AddToWishList toWishList() { return new AddToWishList(); }

}
