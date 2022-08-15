package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import utils.RetryAnalyser;


public class CartPageTest extends BaseWithThreadLocal {

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void priceAndGoodsTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.openPage();
        loginPage.loginForm();
        ProductsPage productsPage = new ProductsPage(getDriver());
        productsPage.addBackpackToCart();
        CartPage cartPage = new CartPage(getDriver());
        cartPage.openShoppingCart();
        String titelActual = cartPage.infoAboutTitel();
        String priceActual = cartPage.infoAboutPrice();
        String titelExpected = "Sauce Labs Backpack";
        String priseExpected = "$29.99";
        Assert.assertEquals(titelExpected, titelActual, "There isn't any goods");
        Assert.assertEquals(priseExpected, priceActual, "There isn't any prise");
    }
}


