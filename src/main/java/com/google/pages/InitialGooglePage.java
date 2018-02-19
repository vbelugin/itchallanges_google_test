package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by andrewkorchevskyi on 2/19/18.
 */
public class InitialGooglePage extends BasePage {

    public InitialGooglePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#lst-ib")
    private WebElement searchField;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    public void searchFor(String searchRequest) {
        searchField.sendKeys(searchRequest);
        searchButton.click();
    }

}
