package co.com.theninjastore.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.theninjastore.userinterfaces.ConfirmationPageUserCreated.FIRST_NAME_VERIFY;

public class VerifyNewRegister implements Question {

    private String expectedFirstName;

    public VerifyNewRegister(String firstName) {
        this.expectedFirstName = firstName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String firstName = FIRST_NAME_VERIFY.resolveFor(actor).getValue();

        return (firstName.equalsIgnoreCase(this.expectedFirstName));
    }

    public static VerifyNewRegister verifyName(String verifyName) {
        return new VerifyNewRegister(verifyName);
    }
}
