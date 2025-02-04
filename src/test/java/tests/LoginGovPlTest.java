package tests;

import org.testng.annotations.Test;
import pages.*;

public class LoginGovPlTest extends BaseTest {

    @Test
    void clickOnLoginGovPl() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        basePage.open();

        mainPage.clickOnEUrzad();

        mainPage.closeCookies();

        mainPage.clickOnUSLoginBtn();

        loginPage.closeCookies();

        loginPage.selectLoginGovPlBtn();
    }
}
