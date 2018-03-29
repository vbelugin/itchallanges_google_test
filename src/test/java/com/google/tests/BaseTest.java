package com.google.tests;

import com.google.utils.PageManager;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by andrewkorchevskyi on 2/19/18.
 */
public class BaseTest {

    private WebDriver driver;
    PageManager app;
    SoftAssertions softAssert;
    private String browserType = System.getProperty("browser");

    @Before
    public void setUp() {
        // If statement was implemented here to check browser type specified with parameter
        switch (browserType) {
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver(); break;
            case "firefox":
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver(); break;
            default:
                throw new NullPointerException("You have to specify correct browser type parameter for running tests, like '-Dbrowser=chrome' or '-Dbrowser=firefox'");
        }
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        app = new PageManager(driver);
        softAssert = new SoftAssertions();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
