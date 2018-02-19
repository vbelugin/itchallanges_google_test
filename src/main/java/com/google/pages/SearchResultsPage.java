package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by andrewkorchevskyi on 2/19/18.
 */
public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "._Rm")
    private WebElement firstResultDescription;

    @FindBy(css = "#hdtb-msb-vis > div:nth-child(1) > a")
    private WebElement allSearchTabButton;

    @FindBy(css = "#hdtb-msb-vis > div:nth-child(2) > a")
    private WebElement imageSearchTabButton;

    @FindBy(css = ".sq")
    private WebElement imageSearchSuggestion;

    public String getFirstResultSiteName() {
        String firstResult = firstResultDescription.getText();
        return firstResult;
    }

    public void openImageSearch() {
        imageSearchTabButton.click();
    }

    public void openAllSearch() {
        allSearchTabButton.click();
    }

    public boolean isImageSearchDisplayed() {
        return imageSearchSuggestion.isDisplayed();
    }




}
