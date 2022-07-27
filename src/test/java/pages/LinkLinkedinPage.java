package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LinkLinkedinPage extends BasePage {
    @FindBy(xpath = "//a[contains (text(), 'LinkedIn')]")
    private WebElement linkLinkedin;


    public LinkLinkedinPage(WebDriver driver) {
        super(driver);
    }

    public void clickLink() {
        linkLinkedin.click();
    }
}
