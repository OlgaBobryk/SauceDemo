package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator {
    WebDriver driver;
    WebElement elementClassName = driver.findElement(By.className("login_wrapper"));
    WebElement elementTagName = driver.findElement(By.tagName("h4"));
    WebElement elementLinkText = driver.findElement(By.linkText("Facebook"));
    WebElement elementPartialLinkText = driver.findElement(By.partialLinkText("Items"));


    WebElement elementXpathAttribute = driver.findElement(By.xpath("//img[@class='footer_robot']"));
    WebElement elementXpathText = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
    WebElement elementXpathPartAttribute = driver.findElement(By.xpath("//div[contains (@ id, 'item')]"));
    WebElement elementXpathPartText = driver.findElement(By.xpath("//button[contains (., 'Add')]"));
    WebElement elementXpathTexPart = driver.findElement(By.xpath("//option[contains (text(), 'A')]"));
    WebElement elementXpathAncestor = driver.findElement(By.xpath("//option[@value='hilo']/ancestor::div"));
    WebElement elementXpathAnd = driver.findElement(By.xpath("//div[@id=\"inventory_container\" and @class='inventory_container']"));

    WebElement elementCssClass = driver.findElement(By.cssSelector(".title"));
    WebElement elementCssId = driver.findElement(By.cssSelector("#cart_contents_container"));
    WebElement elementCssTagName = driver.findElement(By.cssSelector("meta[name='viewport']"));
    WebElement elementCssAttributeBeginning = driver.findElement(By.cssSelector("[name^='theme']"));
    WebElement elementCssAttributeEndig = driver.findElement(By.cssSelector("[rel$='icon']"));
    WebElement elementCssAttribute = driver.findElement(By.cssSelector("[class*='cart']"));
    WebElement elementFirstChild = driver.findElement(By.cssSelector(".bm-burger-button:first-child"));
    WebElement elementCssChild = driver.findElement(By.cssSelector(".footer_copy:nth-child(2)"));


}
