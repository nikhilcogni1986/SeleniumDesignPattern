package com.udemy.selenumdesign;

import com.google.common.util.concurrent.Uninterruptibles;
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
    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@id='L2AGLb']/div")
    private WebElement btnAcceptAll;

    public void clickAccept() throws InterruptedException {
        Thread.sleep(3000);
        this.btnAcceptAll.click();
    }

    public void enter(String keyword)
    {
        this.searchBox.clear();
        for(char ch: keyword.toCharArray())
        {
            Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(20));
            this.searchBox.sendKeys(ch+"");
        }
    }

    SearchWidget(final WebDriver driver)
    {
        super(driver);
    }
    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) ->this.searchBox.isDisplayed());
    }
}