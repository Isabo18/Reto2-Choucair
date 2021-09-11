package com.magneto365.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/loginmagneto.feature",
        glue = "com.magneto365.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class LoginMagnetoRunner {
}
