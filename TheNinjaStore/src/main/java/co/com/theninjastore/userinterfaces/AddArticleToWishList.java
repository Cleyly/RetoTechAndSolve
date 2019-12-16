package co.com.theninjastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddArticleToWishList extends PageObject {

	public static final Target PHONES_AND_PDAS = Target.the("Phones and pdas").located(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"));
	public static final Target BUTTON_WISH_LIST = Target.the("Button wish list").located(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[2]"));

}

