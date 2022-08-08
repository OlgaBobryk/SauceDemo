package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    private WebElement addBackpackButton;
    @FindBy(css = ".shopping_cart_link")
    private WebElement shoppingCart;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isComponentLoad() {
        return shoppingCart.isDisplayed();
    }

    public ProductsPage addBackpackToCart() {
        addBackpackButton.click();
        return this;
    }

}
