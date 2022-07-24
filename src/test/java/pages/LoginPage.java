package pages;

import constants.Register;
import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (name="user-name")
    private WebElement usernameInput;
    @FindBy (name="password")
    private WebElement passwordInput;
    @FindBy (name="login-button")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void  openPage(){
        driver.get(Urls.REGISTER_FORM_URL);
    }

    public boolean loginButtonIsDisplayed(){
        return loginButton.isDisplayed();
    }

    public void loginForm(){
        usernameInput.sendKeys(Register.USERNAME);
        passwordInput.sendKeys(Register.PASSWORD);
        loginButton.click();

    }
}
