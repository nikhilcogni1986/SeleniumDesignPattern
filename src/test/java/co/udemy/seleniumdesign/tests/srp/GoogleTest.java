package co.udemy.seleniumdesign.tests.srp;

import co.udemy.seleniumdesign.tests.BaseTest;
import com.udemy.selenumdesign.GoogleMainPage;
import com.udemy.selenumdesign.GoogleResultsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest
{
    private GoogleMainPage googleMainPage;
    private GoogleResultsPage googleResultsPage;

    @BeforeTest
    public void setupPages()
    {
        googleMainPage = new GoogleMainPage(driver);
        googleResultsPage = new GoogleResultsPage(driver);
    }

    @Test
    public void googleWorkflow() throws InterruptedException {
        googleMainPage.goTo();
        googleMainPage.getSearchWidget().clickAccept();
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());
    }
}
