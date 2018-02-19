package com.google.tests;

import org.junit.Test;

/**
 * Created by andrewkorchevskyi on 2/19/18.
 */
public class ItChallengesGoogleTest extends BaseTest {

    @Test
    public void GoogleTest() {

        String selenideWebsite = "selenide.org/";

        app.initialGooglePage().openGoogleInitialSearchPage();
        app.initialGooglePage().searchFor("Selenide");

        softAssert.assertThat(app.searchResultsPage().getFirstResultSiteName()).isEqualTo(selenideWebsite);

        app.searchResultsPage().openImageSearch();
        softAssert.assertThat(app.searchResultsPage().isImageSearchDisplayed()).isTrue();

        app.searchResultsPage().openAllSearch();
        softAssert.assertThat(app.searchResultsPage().getFirstResultSiteName()).isEqualTo(selenideWebsite);

        softAssert.assertAll();
    }
}
