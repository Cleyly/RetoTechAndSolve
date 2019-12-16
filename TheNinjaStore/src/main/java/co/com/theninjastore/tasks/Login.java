package co.com.theninjastore.tasks;

import co.com.theninjastore.userinterfaces.TheNinjaStoreLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.theninjastore.userinterfaces.TheNinjaStoreLogin.*;

public class Login implements Task {

    private static final String EMAIL_ADDRESS = "cleyly59@gmail.com";
    private static final String PASSWORD = "Lucas";


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MY_ACCOUNT),
                Click.on(LOGIN),
                Enter.theValue(EMAIL_ADDRESS).into(TheNinjaStoreLogin.EMAIL_ADDRESS),
                Enter.theValue(PASSWORD).into(TheNinjaStoreLogin.PASSWORD),
                Click.on(TheNinjaStoreLogin.BUTTON_LOGIN)

        );

    }

    public static Login login() { return new Login(); }

}
