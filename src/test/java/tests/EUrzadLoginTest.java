package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainPage;

public class EUrzadLoginTest extends BaseTest {

    @Test
    void clickOnEUrzad() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = new MainPage(driver);

        basePage.open();

        mainPage.clickOnEUrzad();

        mainPage.closeCookies();

        mainPage.clickOnUSLoginBtn();
    }
}
