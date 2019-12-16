package co.com.theninjastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeleteArticleToCart extends PageObject {

	public static final Target SHOPPING_CART = Target.the("Shopping cart").located(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a"));
	public static final Target QUANTITY_ARTICLES = Target.the("Quantity articles").located(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));
	public static final Target REMOVE = Target.the("Remove").located(By.xpath("//button[@class='btn btn-danger']"));
	public static final Target MESSAGE_CART_EMPTY = Target.the("Message cart empty").located(By.xpath("//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]"));

}

