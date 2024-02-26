package com.udemy.selenumdesign.srp.Main;

import com.udemy.selenumdesign.srp.Common.SearchSuggestion;
import com.udemy.selenumdesign.srp.Common.SearchWidget;
import org.openqa.selenium.WebDriver;

public class GoogleMainPage
{
    protected WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleMainPage(final WebDriver driver)
    {
        this.driver = driver;
        this.searchWidget = new SearchWidget(driver);
        this.searchSuggestion = new SearchSuggestion(driver);
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public void goTo()
    {
        this.driver.get("http://www.google.com");
    }
}