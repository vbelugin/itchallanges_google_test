package com.google.utils;

import com.google.pages.InitialGooglePage;
import com.google.pages.SearchResultsPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by andrewkorchevskyi on 2/19/18.
 */
public class PageManager {
    private final WebDriver driver;

    private InitialGooglePage initialGooglePage;
    private SearchResultsPage searchResultsPage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public InitialGooglePage initialGooglePage() {
        if (initialGooglePage != null) {
            return initialGooglePage;
        }
        initialGooglePage = new InitialGooglePage(driver);
        return initialGooglePage;
    }

    public SearchResultsPage searchResultsPage() {
        if (searchResultsPage != null) {
            return searchResultsPage;
        }
        searchResultsPage = new SearchResultsPage(driver);
        return searchResultsPage;
    }

}
