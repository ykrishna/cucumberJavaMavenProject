package com.krishna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class driverFactory {

    private WebDriver driver = null;
    private SafariOptions safariOptions = new SafariOptions();

    public WebDriver getDriver(String drivertype) {

        if (drivertype == "chrome") {
            driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
        } else if (drivertype == "firefox") {
            driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
        } else if (drivertype == "safari"){
            safariOptions.setCapability("Headless",true);
            driver = new SafariDriver(safariOptions);
        }
        return driver;
    }

}
