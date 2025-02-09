package tests.US;

import org.testng.annotations.Test;
import pages.*;
import pages.US.LoginGovPlPage;
import pages.US.LoginPage;
import pages.US.MainPage;
import tests.BaseTest;

public class ProfilZaufanyTest extends BaseTest {

    @Test
    void clickOnEUrzad() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        LoginGovPlPage loginGovPlPage = new LoginGovPlPage(driver);

        basePage.open();

        mainPage.clickOnEUrzad();

        mainPage.closeCookies();

        mainPage.clickOnUSLoginBtn();

        loginPage.closeCookies();

        loginPage.selectLoginGovPlBtn();

        loginGovPlPage.selectProfilZaufanyBtn();

        loginGovPlPage.selectProfilZaufanyLoginBtn();

        loginGovPlPage.validateLoginError();
    }
}
