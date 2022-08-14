package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkLinkedinPage;
import pages.LinkedinPage;
import pages.LoginPage;
import utils.RetryAnalyser;

public class FailedLogoLinkedinPageTest extends BaseWithFactoryTest {
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void checkLogoLinkedin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.loginForm();
        LinkLinkedinPage linkLinkedin = new LinkLinkedinPage(driver);
        linkLinkedin.clickLink();
        LinkedinPage linkedin = new LinkedinPage(driver);
        linkedin.openNewTab();
        linkedin.waitLoad();
        linkedin.logoIsDisplayed();
        Assert.assertFalse(linkedin.logoIsDisplayed(), "There isn't LinkedinLogo");

    }


}
