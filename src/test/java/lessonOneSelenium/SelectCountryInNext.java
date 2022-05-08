package lessonOneSelenium;

import commonLibrary.CommonNextLibrary;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class SelectCountryInNext extends CommonNextLibrary{
    @Test
    public void selectCountry() throws InterruptedException {
        this.driver.findElement(By.xpath("//*[@id='platform_modernisation_header']/header/div[1]/nav/div[8]/div/button")).click();
        this.driver.findElement(By.id("mui-component-select-country-selector-select")).click();
        List<WebElement> locatedCountries = this.driver.findElements(By.xpath("//input[@id='country-selector-select']/following-sibling::div/div[3]/ul/li/div/img"));
        String expectedCountryToSelect = "NZ";
        Iterator var3 = locatedCountries.iterator();

        String currentCountrySelect;
        while(var3.hasNext()) {
            WebElement country = (WebElement)var3.next();
            currentCountrySelect = country.getAttribute("alt");
            if (currentCountrySelect.equals(expectedCountryToSelect)) {
                country.click();
                break;
            }
        }

        this.driver.findElement(By.xpath("//span[text()='SHOP NOW']")).click();
        String actualUrl = this.driver.getCurrentUrl();
        String requiredUrl = this.driver.getCurrentUrl();
        Assert.assertEquals(requiredUrl, actualUrl);
        Thread.sleep(5000L);
        currentCountrySelect = this.driver.getTitle();
        System.out.println("ET : " + currentCountrySelect);
        String actualTitle = "Next New Zealand | Shop Online For Fashion & Clothing";
        Assert.assertEquals(currentCountrySelect, actualTitle);
    }

}
