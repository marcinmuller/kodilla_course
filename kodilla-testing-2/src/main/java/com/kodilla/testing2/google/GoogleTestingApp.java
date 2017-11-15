package com.kodilla.testing2.google;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Marcin Muller on 15.11.17.
 */
public class GoogleTestingApp {
    public static final String SEARCHFIELD="lst-ib";
    public static void main(String[] args){
        WebDriver driver= WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.pl");

        WebElement searchField=driver.findElement(By.id(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();

    }
}
