package lessonOneSelenium;

import commonLibrary.CommonNextLibrary;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SelectCountryWhereNextOperate extends CommonNextLibrary {

    /*
     * 1. Find a Browser
     * 2. Open Browser.
     * 3. Enter the site URL.
     * 4. Identify the search text field from UI.
     * 5. Click on country flag icon on the homepage.
     * 6. Click on sweden from drop down list.
     * 7. Click on shop now button.
     * 8. Ask selenium to verify it's landed on right page - by checking the flag symbol & URL.
     * 9.close browser
     * */
    @Test
    public void SelectCountryWhereNextOperate() {

        WebElement flagButton = driver.findElement(By.xpath("//*[@id=\"platform_modernisation_header\"]/header/div[1]/nav/div[8]/div/button/img"));
        flagButton.click();
        WebElement locationTextField = driver.findElement(By.xpath("//*[@id=\"mui-component-select-country-selector-select\"]"));
        locationTextField.click();
        WebElement locationTextFieldDropDown = driver.findElement(By.xpath("//*[@id=\"menu-country-selector-select\"]/div[3]/ul/li[63]"));
        locationTextFieldDropDown.sendKeys("sweden");
        WebElement shopNowButton = driver.findElement(By.xpath("//*[@id=\"platform_modernisation_header\"]/header/div[1]/nav/div[9]/div/div[3]/div/div[5]/button/span"));
        shopNowButton.getText();
        driver.get("https://www.next.se/en");
        WebElement cookieButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookieButton.click();


    }

}




