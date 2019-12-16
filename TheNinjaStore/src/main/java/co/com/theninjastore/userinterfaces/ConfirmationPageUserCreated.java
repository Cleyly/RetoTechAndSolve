package co.com.theninjastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPageUserCreated extends PageObject {

    public static final Target EDIT_ACCOUNT = Target.the("Edit account").located(By.xpath("//*[@id=\"content\"]/ul[1]/li[1]/a"));
    public static final Target FIRST_NAME_VERIFY = Target.the("First name verify").located(By.id("input-firstname"));
}
