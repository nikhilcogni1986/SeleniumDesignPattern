package com.udemy.selenumdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchWidget extends AbstractComponent
{
    private WebDriverWait wait;

    @FindBy(name = "q")
    private WebElement searchBox;

    SearchWidget(final WebDriver driver)
    {
        super(driver);
    }
    @Override
    public boolean isDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        return this.searchBox.isDisplayed();
    }
}