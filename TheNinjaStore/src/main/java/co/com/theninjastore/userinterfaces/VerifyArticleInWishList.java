package co.com.theninjastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerifyArticleInWishList extends PageObject {

    public static final Target WISH_LIST = Target.the("Wish list").located(By.xpath("//*[@id=\"wishlist-total\"]"));
    public static final Target PRODUCT_NAME = Target.the("Product name").located(By.xpath("//div[@id='account-wishlist']//tbody//td[2]"));

}
