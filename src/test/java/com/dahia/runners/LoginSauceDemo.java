package com.dahia.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/login_sauce_demo.feature",
                    glue = "com.dahia.stepdefinitions",
                    snippets = SnippetType.CAMELCASE)

public class LoginSauceDemo {
}
