package com.google.tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by andrewkorchevskyi on 2/19/18.
 */
public class BaseTest {

    private WebDriver driver;

    @BeforeClass
    public static void getDriver() {
        ChromeDriverManager.getInstance().setup();
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
