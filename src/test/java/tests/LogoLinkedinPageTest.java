package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkLinkedinPage;
import pages.LinkedinPage;
import pages.LoginPage;
import utils.RetryAnalyser;

public class LogoLinkedinPageTest extends BaseWithThreadLocal {
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void checkLogoLinkedin() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.openPage();
        loginPage.loginForm();
        LinkLinkedinPage linkLinkedin = new LinkLinkedinPage(getDriver());
        linkLinkedin.clickLink();
        LinkedinPage linkedin = new LinkedinPage(getDriver());
        linkedin.openNewTab();
        linkedin.waitLoad();
        linkedin.logoIsDisplayed();
        Assert.assertTrue(linkedin.logoIsDisplayed(), "There isn't LinkedinLogo");

    }


}
