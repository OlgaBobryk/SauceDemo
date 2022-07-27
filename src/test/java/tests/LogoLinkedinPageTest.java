package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkLinkedinPage;
import pages.LinkedinPage;
import pages.LoginPage;

public class LogoLinkedinPageTest extends BaseTest {
    @Test
    public void checkLogoLinkedin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.loginForm();
        removeImplicityWait();
        LinkLinkedinPage linkLinkedin = new LinkLinkedinPage(driver);
        linkLinkedin.clickLink();
        LinkedinPage linkedin = new LinkedinPage(driver);
        linkedin.openNewTab();
        linkedin.waitLoad();
        linkedin.logoIsDisplayed();
        setImplicityWait();
        Assert.assertTrue(linkedin.logoIsDisplayed(), "There isn't LinkedinLogo");

    }

}
