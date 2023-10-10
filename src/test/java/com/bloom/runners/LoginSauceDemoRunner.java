package com.bloom.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login_saucedemo.feature",
        glue = "com.bloom.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class LoginSauceDemoRunner {
}
