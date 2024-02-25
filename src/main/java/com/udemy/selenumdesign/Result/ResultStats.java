package com.udemy.selenumdesign.Result;

import com.udemy.selenumdesign.Common.AbstractComponent;
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

    public String getStats()
    {
        return this.stats.getText();
    }
    @Override
    public boolean isDisplayed() {
        return this.wait.until((d)-> this.stats.isDisplayed());
    }
}