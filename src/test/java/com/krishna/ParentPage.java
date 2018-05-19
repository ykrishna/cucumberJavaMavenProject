package com.krishna;

import org.openqa.selenium.WebDriver;

public class ParentPage {

    private WebDriver driver;

    public ParentPage() {
        driver = new driverFactory().getDriver("chrome");
    }

    public void navigate(String url) {
        driver.get(url);
        driver.quit();
    }
}
