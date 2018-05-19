package com.krishna;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by krishnayalavarthi on 24/03/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        //glue = {"src/test/java/com/krishna"},
        features = "src/test/resources/features"
)
public class cukeJunitRunnerTest {
}
