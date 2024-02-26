package com.udemy.selenumdesign.factory;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleEnglishPage extends GooglePage
{
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name="q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement btnSearch;

    @FindBy(css="div.MjjYud")
    private List<WebElement> results;

    @FindBy(xpath = "//button[@id='L2AGLb']/div")
    private WebElement btnAcceptAll;

    @Override
    public void launchSite() throws InterruptedException {
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

    @Override
    public void search(String keyword) {
        this.btnSearch.sendKeys(keyword);
    }

    @Override
    public int getResultsCount() {
        this.wait.until((d)-> this.results.size() > 5);
        return this.results.size();
    }
}
