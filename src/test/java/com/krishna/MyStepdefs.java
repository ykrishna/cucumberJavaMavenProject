/*
  this is Java 7 style of writing code
 */
package com.krishna;

import cucumber.api.java.en.Given;

public class MyStepdefs {

    private ParentPage parentPage = new ParentPage();

    @Given("^I open tablet \"([^\"]*)\" site$")
    public void iOpenSite(String url) throws Throwable {
        parentPage.navigate(url);
    }
}
