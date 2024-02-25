package com.udemy.selenumdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage
{
    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleMainPage(final WebDriver driver)
    {
        this.searchWidget = PageFactory.initElements(driver, searchWidget.getClass());
        this.searchSuggestion = PageFactory.initElements(driver, searchSuggestion.getClass());
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public void goTo()
    {
        driver.get("http://www.google.com");
    }
}