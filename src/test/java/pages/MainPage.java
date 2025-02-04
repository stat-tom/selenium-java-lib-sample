package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import tests.EUrzadLoginTest;

import java.time.Duration;

public class MainPage extends BasePage {
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEUrzadBtn() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href=\"https://www.podatki.gov.pl/e-urzad-skarbowy/\"]")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void clickOnEUrzad() {
        getEUrzadBtn().click();
    }

    private WebElement getCookiesBtn() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("cc-compliance")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void closeCookies() {
        getCookiesBtn().click();
    }

    private WebElement getUSLoginBtn() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href=\"https://urzadskarbowy.gov.pl/\"]")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void clickOnUSLoginBtn() {
        getUSLoginBtn().click();
    }

}
