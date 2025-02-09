package tests.US;

import org.testng.annotations.Test;
import pages.*;
import pages.US.LoginPage;
import pages.US.MainPage;
import tests.BaseTest;

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
