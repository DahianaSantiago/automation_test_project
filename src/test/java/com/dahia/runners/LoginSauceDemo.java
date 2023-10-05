package com.dahia.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/login_suace_demo.feature",
glue = "src.test.java.com.dahia.stepdefinitions")
public class LoginSauceDemo {
}
