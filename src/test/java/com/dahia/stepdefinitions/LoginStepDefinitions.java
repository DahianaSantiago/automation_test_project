package com.dahia.stepdefinitions;

import com.dahia.pages.LoginPage;
import cucumber.api.java.en.*;
import org.fluentlenium.core.annotation.Page;


public class LoginStepDefinitions {

    @Page
    private LoginPage loginPage;

    @Given("the user is in the page")
    public void the_user_is_in_the_page() {
        loginPage.open();
    }

    @When("the user enter the credentials")
    public void the_user_enter_the_credentials() {
    }

    @Then("the user can enter")
    public void the_user_can_enter() {

    }



}
