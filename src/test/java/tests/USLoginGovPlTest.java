package tests;

import org.testng.annotations.Test;
import pages.*;
import pages.US.LoginPage;
import pages.US.MainPage;

public class USLoginGovPlTest extends BaseTest {

    @Test
    void clickOnLoginGovPl() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        basePage.open("https://www.podatki.gov.pl/");

        mainPage.clickOnEUrzad();

        mainPage.closeCookies();

        mainPage.clickOnUSLoginBtn();

        loginPage.closeCookies();

        loginPage.selectLoginGovPlBtn();
    }
}
