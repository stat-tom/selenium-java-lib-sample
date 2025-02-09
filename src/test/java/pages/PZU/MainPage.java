package pages.PZU;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;
import java.time.Duration;

public class MainPage extends BasePage {
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getCookies() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Locate shadow host
        WebElement shadowHost = driver.findElement(By.id("cmpwrapper"));
        // Get shadow root using Selenium's getShadowRoot() method (no casting needed)
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        // Wait for the element inside the shadow root
        WebElement element = wait.until(driver -> {
            WebElement btn = ((org.openqa.selenium.SearchContext) shadowRoot).findElement(By.cssSelector("a.cmptxt_btn_yes"));
            return (btn.isDisplayed() && btn.isEnabled()) ? btn : null;
        });
        // Assert element is found
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void closeCookies() {
        getCookies().click();
    }

    private WebElement getMainBannerBtn() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='https://moje.pzu.pl/pzu/travel/policy-details?mcid=p_pzu']")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void clickOnMainBanner() {
        getMainBannerBtn().click();
    }

    private WebElement getEmailInput() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("mat-mdc-form-field-label-0")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void provideEmail(String email) {
        getEmailInput().sendKeys(email);
    }

    private WebElement getPasswordInput() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("mat-mdc-form-field-label-2")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void providePassword(String password) {
        getPasswordInput().sendKeys(password);
    }

    private WebElement getLoginBtn() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@class='pak-login-form__sign-in']")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void clickOnLoginBtn() {
        getLoginBtn().click();
    }

    private WebElement getLoginFormError() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@class='pak-login-form__error']")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }

    public void getErrorText() {
        getLoginFormError().getText();
    }

}
