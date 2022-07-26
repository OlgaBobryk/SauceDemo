package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(css = ".shopping_cart_link")
    private WebElement shoppingCart;
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    private WebElement backPackInCart;
    @FindBy(xpath = "//div[text()='29.99']")
    private WebElement priceInCart;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openShoppingCart() {
        shoppingCart.click();
    }

    public String infoAboutTitel() {
       return backPackInCart.getText();
    }

    public String infoAboutPrice() {
      return   priceInCart.getText();
    }

}
