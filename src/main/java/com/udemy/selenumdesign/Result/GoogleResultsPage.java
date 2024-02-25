package com.udemy.selenumdesign.Result;

import com.udemy.selenumdesign.Common.SearchSuggestion;
import com.udemy.selenumdesign.Common.SearchWidget;
import org.openqa.selenium.WebDriver;

public class GoogleResultsPage
{
    private SearchSuggestion searchSuggestion;
    private NavigationBar navigationBar;
    private SearchWidget searchWidget;
    private ResultStats resultStats;
    protected WebDriver driver;

    public GoogleResultsPage(final WebDriver driver)
    {
        this.driver = driver;
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
