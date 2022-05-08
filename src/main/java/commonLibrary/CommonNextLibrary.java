package commonLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CommonNextLibrary {

    public WebDriver driver;

    @Before

    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.next.co.uk/";
        Assert.assertEquals(expectedURL, actualURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement cookieButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookieButton.click();

    }

    @After

    public void closeBrowser() {

        driver.quit();

    }
}
