package com.udemy.selenumdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultStats extends AbstractComponent
{
    public ResultStats(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="result-stats")
    private WebElement stats;

    @Override
    public boolean isDisplayed() {
        return wait.until((d)-> this.stats.isDisplayed());
    }
}