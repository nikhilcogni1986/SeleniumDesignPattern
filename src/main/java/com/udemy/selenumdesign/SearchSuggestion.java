package com.udemy.selenumdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchSuggestion extends AbstractComponent
{
    @FindBy(css="li.sbct")
    private List<WebElement> suggestions;

    public SearchSuggestion(final WebDriver driver)
    {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d)-> this.suggestions.size() > 5);
    }
}