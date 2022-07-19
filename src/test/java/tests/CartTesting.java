package tests;

import constants.Register;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CartTesting extends BaseTest {

    @Test
    public void priceAndGoodsTest() {

        //Open url of  page
        driver.get(Urls.REGISTER_FORM_URL);
        //Input username into the field "Username"
        driver.findElement(By.name("user-name")).sendKeys(Register.USERNAME);
        //Input password into the field "Password"
        driver.findElement(By.name("password")).sendKeys(Register.PASSWORD);
        // Click "Login"
        driver.findElement(By.name("login-button")).click();
        //Add to the Shoppingcart
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        //Cart
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();

        //Add check
        String goodTitelActual = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
        String goodTitelExpected = "Sauce Labs Backpack";
        String priceActual = driver.findElement(By.xpath("//div[text()='29.99']")).getText();
        String priseExpected = "$29.99";
        Assert.assertEquals(goodTitelExpected, goodTitelActual, "There isn't any goods");
        Assert.assertEquals(priseExpected, priceActual, "There isn't any prise");
    }
}


