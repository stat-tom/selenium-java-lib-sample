package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class LoginGovPlTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(LoginGovPlTest.class);
    String url = "https://www.podatki.gov.pl/";

    @Test
    void clickOnLoginGovPl() {
        MainPage mainPage = new MainPage(driver);
        driver.get(url);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, url, "Url doesn't match!");

        mainPage.clickOnEUrzad();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"https://www.podatki.gov.pl/e-urzad-skarbowy/\"]")));
        logger.info("element: {}", element);
        Assert.assertNotNull(element, "Element not found!");
        element.click();
        WebElement cookies = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cc-compliance")));
        logger.info("element: {}", cookies);
        Assert.assertNotNull(cookies, "Element not found!");
        cookies.click();
        WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"https://urzadskarbowy.gov.pl/\"]")));
        logger.info("element: {}", loginBtn);
        Assert.assertNotNull(loginBtn, "Element not found!");
        loginBtn.click();
        WebElement cookies2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cc-compliance")));
        logger.info("element: {}", cookies2);
        Assert.assertNotNull(cookies2, "Element not found!");
        cookies2.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("external-login-method")));
        WebElement loginGovPlBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dsPrimaryButton-4aefc84a15934c17b4c8a798c74685bd dsPrimaryButton-5e1d892098009ad2ba1a75af6a9be076']")));
        logger.info("element: {}", loginGovPlBtn);
        Assert.assertNotNull(loginGovPlBtn, "Element not found!");
        loginGovPlBtn.click();
    }

//    @Test(priority = 3)
//    void closeCookies() {
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cc-compliance")));
//        logger.info("element: {}", element);
//        Assert.assertNotNull(element, "Element not found!");
//        element.click();
//    }
//
//    @Test(priority = 4)
//    void loginToEUrzad() {
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"https://urzadskarbowy.gov.pl/\"]")));
//        logger.info("element: {}", element);
//        Assert.assertNotNull(element, "Element not found!");
//        element.click();
//    }
//
//    @Test(priority = 5)
//    void closeCookie2() {
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cookieConsentButton")));
//        logger.info("element: {}", element);
//        Assert.assertNotNull(element, "Element not found!");
//        element.click();
//    }
//
//    @Test(priority = 6)
//    void selectLoginGovPl() {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("external-login-method")));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dsPrimaryButton-4aefc84a15934c17b4c8a798c74685bd dsPrimaryButton-5e1d892098009ad2ba1a75af6a9be076']")));
//        logger.info("element: {}", element);
//        Assert.assertNotNull(element, "Element not found!");
//        element.click();
//    }
//
//    @Test(priority = 7)
//    void selectProfilZaufany() {
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='gov2-login__list']/li[1]")));
//        logger.info("element: {}", element);
//        Assert.assertNotNull(element, "Element not found!");
//        element.click();
//    }
//
//    @Test(priority = 8)
//    void validateLoginBtn() {
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginForm:loginButton")));
//        logger.info("element: {}", element);
//        Assert.assertNotNull(element, "Element not found!");
//    }

//    @Test(priority=10)
//    void teardown() {
//        driver.quit();
//    }
}
