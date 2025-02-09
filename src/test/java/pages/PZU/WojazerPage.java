package pages.PZU;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;
import java.time.Duration;

public class WojazerPage extends BasePage {
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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


    public String getPageTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("pak-app__main")));
        String title = driver.getTitle();
        Assert.assertEquals(title, "PZU Wojażer - kup ubezpieczenie podróży online");
        return driver.getTitle();
    }

}
