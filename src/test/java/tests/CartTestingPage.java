package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;


public class CartTestingPage extends BaseTest {

    @Test
    public void priceAndGoodsTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.loginForm();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addBackpackToCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.openShoppingCart();
        String titelActual = cartPage.infoAboutTitel();
        String priceActual = cartPage.infoAboutPrice();
        String titelExpected = "Sauce Labs Backpack";
        String priseExpected = "$29.99";
        Assert.assertEquals(titelExpected, titelActual, "There isn't any goods");
        Assert.assertEquals(priseExpected, priceActual, "There isn't any prise");
    }
}


