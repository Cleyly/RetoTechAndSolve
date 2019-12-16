package co.com.theninjastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheNinjaStoreLogin  extends PageObject {
    public static final Target MY_ACCOUNT = Target.the("My account").located(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
    public static final Target LOGIN = Target.the("Button login").located(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
    public static final Target EMAIL_ADDRESS = Target.the("Email address").located(By.id("input-email"));
    public static final Target PASSWORD = Target.the("Password").located(By.id("input-password"));
    public static final Target BUTTON_LOGIN = Target.the("Btn login").located(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

}
