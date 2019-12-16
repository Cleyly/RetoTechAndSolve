package co.com.theninjastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerifyArticleInCart extends PageObject {

    public static final Target SHOPPING_CART = Target.the("Shopping cart").located(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a"));
    public static final Target QUANTITY = Target.the("Quantity").located(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));
}
