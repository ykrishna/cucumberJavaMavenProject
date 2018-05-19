package com.krishna;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Created by krishnayalavarthi on 24/03/2018.
 */
public class MyStepdefs implements En {

    public FirefoxOptions options = new FirefoxOptions().setHeadless(true);
    public WebDriver driver = new FirefoxDriver(options);

    public MyStepdefs() {
        Given("^I open \"([^\"]*)\" site$", (String url) -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new PendingException();
            driver.get(url);
            driver.quit();
            System.out.println("<------- I am working ----->");
        });
    }
}
