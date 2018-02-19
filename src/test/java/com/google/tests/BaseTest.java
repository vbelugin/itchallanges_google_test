package com.google.tests;

import com.google.utils.PageManager;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by andrewkorchevskyi on 2/19/18.
 */
public class BaseTest {

    private WebDriver driver;
    protected PageManager app;
    protected SoftAssertions softAssert;

    @BeforeClass
    public static void getDriver() {
        ChromeDriverManager.getInstance().setup();
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
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
