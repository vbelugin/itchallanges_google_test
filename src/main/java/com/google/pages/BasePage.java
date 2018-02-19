package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by andrewkorchevskyi on 2/19/18.
 */
public class BasePage {

    protected String googleBaseURL = "http://google.com/ncr";

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void openGoogle() {
        driver.get(googleBaseURL);
    }

}
