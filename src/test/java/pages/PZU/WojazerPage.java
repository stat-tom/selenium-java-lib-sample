package pages.PZU;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;

import java.time.Duration;

public class WojazerPage extends BasePage {
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private static final Logger logger = LoggerFactory.getLogger(WojazerPage.class);
    public WojazerPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getModal() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@class='closse']")));
        Assert.assertNotNull(element, "Element not found!");
        return element;
    }
    public void closeModal() {
        getModal().click();
    }


    public void getPageTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("pak-app__main")));
        String title = driver.getTitle();
        logger.info(title);
        Assert.assertEquals(title, "PZU Wojażer - kup ubezpieczenie podróży online");
    }

}
