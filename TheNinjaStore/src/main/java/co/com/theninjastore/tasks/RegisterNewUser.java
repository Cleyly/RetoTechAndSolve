package co.com.theninjastore.tasks;

import co.com.theninjastore.userinterfaces.TheNinjaStoreRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.theninjastore.userinterfaces.TheNinjaStoreRegister.*;
import static co.com.theninjastore.userinterfaces.VerifyUserCreated.EDIT_ACCOUNT;

public class RegisterNewUser implements Task {

    public static final String FIRST_NAME = "Joyce";
    private static final String LAST_NAME = "Montoya";
    private static final String EMAIL = "abcd@gmail.com";
    private static final String TELEPHONE = "3007650924";
    private static final String PASSWORD = "Azul";
    private static final String PASSWORD_CONFIRM = "Azul";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(FIRST_NAME).into(TheNinjaStoreRegister.FIRST_NAME),
                Enter.theValue(LAST_NAME).into(TheNinjaStoreRegister.LAST_NAME),
                Enter.theValue(EMAIL).into(TheNinjaStoreRegister.EMAIL),
                Enter.theValue(TELEPHONE).into(TheNinjaStoreRegister.TELEPHONE),
                Enter.theValue(PASSWORD).into(TheNinjaStoreRegister.PASSWORD),
                Enter.theValue(PASSWORD_CONFIRM).into(TheNinjaStoreRegister.PASSWORD_CONFIRM),
                Click.on(PRIVACY_POLICY),
                Click.on(BUTTON_CONTINUE),
                Click.on(BUTTON_CONTINUE_TWO),
                Click.on(EDIT_ACCOUNT)

        );

    }

    public static RegisterNewUser fillFields() { return new RegisterNewUser(); }

}
