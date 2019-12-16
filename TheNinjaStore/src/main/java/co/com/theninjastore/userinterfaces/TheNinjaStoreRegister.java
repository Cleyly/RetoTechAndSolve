package co.com.theninjastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheNinjaStoreRegister extends PageObject {

	public static final Target MY_ACCOUNT = Target.the("My account").located(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
	public static final Target BUTTON_REGISTER = Target.the("Button register").located(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
	public static final Target FIRST_NAME = Target.the("First name").located(By.id("input-firstname"));
	public static final Target LAST_NAME = Target.the("Last name").located(By.id("input-lastname"));
	public static final Target EMAIL = Target.the("Email").located(By.id("input-email"));
	public static final Target TELEPHONE = Target.the("Telephone").located(By.id("input-telephone"));
	public static final Target PASSWORD = Target.the("Password").located(By.id("input-password"));
	public static final Target PASSWORD_CONFIRM = Target.the("Password confirm").located(By.id("input-confirm"));
	public static final Target PRIVACY_POLICY = Target.the("Privacy policy").located(By.name("agree"));
	public static final Target BUTTON_CONTINUE = Target.the("Button continue").located(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
	public static final Target BUTTON_CONTINUE_TWO = Target.the("Button continue two").located(By.xpath("//*[@id=\"content\"]/div/div/a"));
}
