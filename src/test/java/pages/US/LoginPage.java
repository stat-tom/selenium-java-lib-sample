package pages.US;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;
import tests.USLoginGovPlTest;

import java.time.Duration;

public class LoginPage extends BasePage {
    private static final Logger logger = LoggerFactory.getLogger(USLoginGovPlTest.class);
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement loginGovPlBtn() {
        WebElement elementToScroll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login-methods-list")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScroll);

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dsPrimaryButton-4aefc84a15934c17b4c8a798c74685bd dsPrimaryButton-5e1d892098009ad2ba1a75af6a9be076']")));
        logger.info("element: {}", element);
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void selectLoginGovPlBtn() {
        loginGovPlBtn().click();
    }

    private WebElement getCookiesBtn() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("cookieConsentButton")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void closeCookies() {
        getCookiesBtn().click();
    }
}
