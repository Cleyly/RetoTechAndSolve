package co.com.theninjastore.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.theninjastore.userinterfaces.VerifyUserCreated.FIRST_NAME_VERIFY;

public class VerifyNewRegister implements Question {

    private String firstName;

    public VerifyNewRegister(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String firstName = FIRST_NAME_VERIFY.resolveFor(actor).getValue();

        if (firstName.equalsIgnoreCase(this.firstName)) {
            return true;
        } else {
            return false;
        }
    }

    public static VerifyNewRegister verifyName(String verifyName) {
        return new VerifyNewRegister(verifyName);
    }
}
