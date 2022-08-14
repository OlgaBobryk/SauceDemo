package tests;

import factorymanager.DriverFactory;
import factorymanager.DriverManager;
import factorymanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    public WebDriver driver;
    public DriverManager driverManager;

    @BeforeSuite
    public void setUp() {
        DriverFactory driverFactory = new DriverFactory();
        driverManager = driverFactory.getManager(DriverType.CHROME);
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();
        driver = driverManager.getDriver();
    }


    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();
    }
}
