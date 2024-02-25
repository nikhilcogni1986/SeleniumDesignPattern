package com.udemy.selenumdesign;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class SearchWidget extends AbstractComponent
{
    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@id='L2AGLb']/div")
    private WebElement btnAcceptAll;

    public void clickAccept() throws InterruptedException {
        Thread.sleep(2000);
        try
        {
            if(this.btnAcceptAll.isDisplayed()) {
                System.out.println("Element is present and displayed");
                this.btnAcceptAll.click();
            }
            else
                System.out.println("Element is present but not displayed");
        }
        catch (NoSuchElementException e) {
            System.out.println("Element is not present, hence not displayed");
        }
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