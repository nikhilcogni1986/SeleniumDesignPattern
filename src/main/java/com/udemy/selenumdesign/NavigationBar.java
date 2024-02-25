package com.udemy.selenumdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent
{
    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="bqHHPb")
    private WebElement bar;

    @FindBy(linkText="Images")
    private WebElement images;

    @FindBy(linkText="Github")
    private WebElement github;

    public void gotoImages()
    {
        this.images.click();
    }

    public void gotoGithub()
    {
        this.github.click();
    }

    @Override
    public boolean isDisplayed()
    {
        return this.wait.until((d)-> bar.isDisplayed());
    }
}