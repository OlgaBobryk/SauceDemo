package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;


public class LinkedinPage extends BasePage {
    @FindBy(xpath = "//a[@href]//icon[1]")
    WebElement logo;
    @FindBy(xpath = "//button[@id='join-form-submit']")
    WebElement submitButton;

    public LinkedinPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isComponentLoad() {
        return submitButton.isDisplayed();
    }

    public void openNewTab() {
        Set<String> tabs = driver.getWindowHandles();
        for (String tabLinkedin : tabs) {
            driver.switchTo().window(tabLinkedin);
        }
    }

    public void waitLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(logo));

    }

    public boolean logoIsDisplayed() {
        return logo.isDisplayed();
    }
}
