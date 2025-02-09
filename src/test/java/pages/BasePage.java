package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage {
    protected WebDriver driver;
    private String url = "https://www.pzu.pl/"; //"https://www.podatki.gov.pl/"

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(url);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, url, "Url doesn't match!");
    }
}
