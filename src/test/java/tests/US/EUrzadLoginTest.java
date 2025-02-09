package tests.US;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.US.MainPage;
import tests.BaseTest;

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
