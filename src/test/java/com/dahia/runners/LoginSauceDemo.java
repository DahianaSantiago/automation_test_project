package com.dahia.runners;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/login_SauceDemo.feature",
                    glue = "src.test.java.com.dahia.stepdefinitions")

public class LoginSauceDemo {
}
