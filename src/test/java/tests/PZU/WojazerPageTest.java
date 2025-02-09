package tests.PZU;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.PZU.MainPage;
import pages.PZU.WojazerPage;
import tests.BaseTest;

public class WojazerPageTest extends BaseTest {

    @Test
    void openPzuWojazer() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = new MainPage(driver);
        WojazerPage wojazerPage = new WojazerPage(driver);

        basePage.open();
        mainPage.closeCookies();
        mainPage.clickOnMainBanner();
        wojazerPage.getPageTitle();
    }
}
