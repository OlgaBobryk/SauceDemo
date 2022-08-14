package pages;

import constants.Register;
import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "user-name")
    private WebElement usernameInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(name = "login-button")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isComponentLoad() {
        return loginButton.isDisplayed();
    }

    public LoginPage openPage() {
        driver.get(Urls.REGISTER_FORM_URL);
        return this;
    }


    public ProductsPage loginForm() {
        usernameInput.sendKeys(Register.USERNAME);
        passwordInput.sendKeys(Register.PASSWORD);
        loginButton.click();
        return new ProductsPage(driver);

    }
}
