package co.com.theninjastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddArticleToCart extends PageObject {

	public static final Target PHONES_AND_PDAS = Target.the("Phones and pdas").located(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"));
	public static final Target ADD_TO_CART = Target.the("Add to cart").located(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[1]"));

}

