package pages.US;

import org.openqa.selenium.By;
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

public class LoginGovPlPage extends BasePage {
    private static final Logger logger = LoggerFactory.getLogger(USLoginGovPlTest.class);
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public LoginGovPlPage(WebDriver driver) {
        super(driver);
    }

    private WebElement profilZaufanyBtn() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='gov2-login__list']/li[1]")));
        logger.info("element: {}", element);
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void selectProfilZaufanyBtn() {
        profilZaufanyBtn().click();
    }

    private WebElement profilZaufanyLoginBtn() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("loginForm:loginButton")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void selectProfilZaufanyLoginBtn() {
        profilZaufanyLoginBtn().click();
    }

    private WebElement loginError() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("error-list")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void validateLoginError() {
        String elementText = loginError().getText();
        logger.info("Login error: " + elementText);
    }
}
