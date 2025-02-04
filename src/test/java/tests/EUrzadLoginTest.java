package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class EUrzadLoginTest extends BaseTest {
    String url = "https://www.podatki.gov.pl/";

    @Test
    void clickOnEUrzad() {
        MainPage mainPage = new MainPage(driver);
        driver.get(url);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, url, "Url doesn't match!");

        mainPage.clickOnEUrzad();

        mainPage.closeCookies();

        mainPage.clickOnUSLoginBtn();
    }
}
