package co.com.theninjastore.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.theninjastore.userinterfaces.TheNinjaStoreRegister.BUTTON_REGISTER;
import static co.com.theninjastore.userinterfaces.TheNinjaStoreRegister.MY_ACCOUNT;

public class CreateNewUser implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MY_ACCOUNT),
                Click.on(BUTTON_REGISTER)
        );
    }


    public static CreateNewUser goToRegister() {
        return new CreateNewUser();
    }

}
