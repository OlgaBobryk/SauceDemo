package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseWithThreadLocal {
    protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        threadLocalDriver.set(driver);
    }

    public static WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        threadLocalDriver.get().quit();
    }

}