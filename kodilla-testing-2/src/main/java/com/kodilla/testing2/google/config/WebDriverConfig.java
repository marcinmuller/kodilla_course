package com.kodilla.testing2.google.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Marcin Muller on 15.11.17.
 */
public class WebDriverConfig {
    public final static String CHROME="CHROME_DRIVER";
    public final static String FF="FF_DRIVER";
    public static WebDriver getDriver(final String driver){
        System.setProperty("webdriver.chrome.driver","/home/iliak/Pulpit/Kodilla/selenium/chromedriver");
        System.setProperty("webdriver.gecko.driver","/home/iliak/Pulpit/Kodilla/selenium/geckodriver");

        if(driver.equals(CHROME)){
            return new ChromeDriver();
        }else if(driver.equals(FF)){
            return new FirefoxDriver();
        }else{
            return null;
        }
    }
}
