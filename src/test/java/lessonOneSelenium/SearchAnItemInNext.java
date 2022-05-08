package lessonOneSelenium;

import commonLibrary.CommonNextLibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SearchAnItemInNext extends CommonNextLibrary {


    /*
     * 1. Find a Browser
     * 2. Open Browser.
     * 3. Enter the site URL.
     * 4. Identify the search text field from UI.
     * 5. Enter text to the text field.
     * 6. Click the search button.
     * 7. Redirects to search results page.
     * 8. Ask selenium to verify its landed on right page - by checking the page title.
     * 9. Close browser
     * */


    @Test
    public void searchAnItemUsingBrandName() {


        WebElement searchTextField = driver.findElement(By.id("header-big-screen-search-box"));
        searchTextField.sendKeys("Nike");
        WebElement searchButton = driver.findElement(By.xpath("//form[@id=\"header-search-form\"]/button/span[1]/img"));
        searchButton.click();
        WebElement searchResultTitleHeader = driver.findElement(By.xpath("//*[@id=\"ResultHeader\"]/div[1]/h1"));
        String actualSearchResultText = searchResultTitleHeader.getText();
        String expectedSearchResultText = "Nike";
        Assert.assertEquals(expectedSearchResultText, actualSearchResultText);

    }

    @Test
    public void searchAnItemUSingProductName() {

        WebElement searchTextField = driver.findElement(By.id("header-big-screen-search-box"));
        searchTextField.sendKeys("Jeans");
        WebElement searchButton = driver.findElement(By.xpath("//form[@id=\"header-search-form\"]/button/span[1]/img"));
        searchButton.click();
        WebElement searchResultTitleHeader = driver.findElement(By.xpath("//*[@id=\"ResultHeader\"]/div[1]/h1"));
        String actualSearchResultText = searchResultTitleHeader.getText();
        String expectedSearchResultText = "Jeans";
        Assert.assertEquals(expectedSearchResultText, actualSearchResultText);

    }
}
