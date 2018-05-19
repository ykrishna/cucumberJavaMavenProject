/*
 this is java 8 way of writing code
 */
package com.krishna;

import cucumber.api.java8.En;

public class StepDefinitions implements En {

    private ParentPage parentPage = new ParentPage();

    public StepDefinitions() {

        Given("^I open \"([^\"]*)\" site$", (String url) -> {
            parentPage.navigate(url);
        });
    }
}
