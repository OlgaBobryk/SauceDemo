package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    private WebElement addBackpackButton;


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void addBackpackToCart() {
        addBackpackButton.click();
    }

}
