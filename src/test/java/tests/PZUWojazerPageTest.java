package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.PZU.MainPage;
import pages.PZU.WojazerPage;

public class PZUWojazerPageTest extends BaseTest {

    @Test
    void openPzuWojazer() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = new MainPage(driver);
        WojazerPage wojazerPage = new WojazerPage(driver);

        basePage.open("https://www.pzu.pl/");
        mainPage.closeCookies();
        mainPage.clickOnMainBanner();
        wojazerPage.getPageTitle();
    }
}
