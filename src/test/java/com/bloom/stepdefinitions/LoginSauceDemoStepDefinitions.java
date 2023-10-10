package com.bloom.stepdefinitions;

import com.bloom.steps.LoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LoginSauceDemoStepDefinitions {

    @Steps
    LoginStep loginStep;
    @Given("the user {string} login in the Suace demo page")
    public void theUserLoginInTheSuaceDemoPage(String name) {
        loginStep.openBrowse();
        loginStep.login();

    }

    @When("the user add the product")
    public void theUserAddTheProduct() {

    }

    @When("do the checkout")
    public void doTheCheckout(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("can see the succesfull purchase")
    public void canSeeTheSuccesfullPurchase() {

    }



}
