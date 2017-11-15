package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Marcin Muller on 15.11.17.
 */
public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY="//div[contains(@class, \"large_form\")]/div/div/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH="//div[contains(@class, \"large_form\")]/div/div/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR="//div[contains(@class, \"large_form\")]/div/div/span/span/select[3]";
    public static void main(String[] args){
        WebDriver driver= WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        Select selectDay=new Select(driver.findElement(By.xpath(XPATH_SELECT_DAY)));
        selectDay.selectByIndex(7);

        Select selectMonth=new Select(driver.findElement(By.xpath(XPATH_SELECT_MONTH)));
        selectMonth.selectByIndex(8);

        Select selectYear=new Select(driver.findElement(By.xpath(XPATH_SELECT_YEAR)));
        selectYear.selectByIndex(9);
    }
}
