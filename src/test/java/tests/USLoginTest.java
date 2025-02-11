package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.US.MainPage;

public class USLoginTest extends BaseTest {

    @Test
    void clickOnEUrzad() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = new MainPage(driver);

        basePage.open("https://www.podatki.gov.pl/");

        mainPage.clickOnEUrzad();

        mainPage.closeCookies();

        mainPage.clickOnUSLoginBtn();
    }
}
