package com.udemy.selenumdesign;

import org.openqa.selenium.WebDriver;

public class GoogleResultsPage
{
    private SearchSuggestion searchSuggestion;
    private NavigationBar navigationBar;
    private SearchWidget searchWidget;
    private ResultStats resultStats;

    public GoogleResultsPage(final WebDriver driver)
    {
        this.searchWidget = new SearchWidget(driver);
        this.searchSuggestion = new SearchSuggestion(driver);
        this.navigationBar = new NavigationBar(driver);
        this.resultStats = new ResultStats(driver);
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public ResultStats getResultStats() {
        return resultStats;
    }
}
