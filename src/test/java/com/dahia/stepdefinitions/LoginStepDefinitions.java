package com.dahia.stepdefinitions;

import com.dahia.pages.LoginPage;
import com.dahia.pages.ProductsPage;
import cucumber.api.java.en.*;
import org.fluentlenium.core.annotation.Page;


public class LoginStepDefinitions {

    @Page
     LoginPage loginPage;

    @Page
    ProductsPage productsPage;


    @Given("the user is in the page")
    public void theUserIsInThePage() {
        loginPage.open();
    }

    @When("the user enter the credentials")
    public void theUserEnterTheCredentials() {
            loginPage.enterUserName("standard_user");
            loginPage.enterPassword("secret_sauce");
            loginPage.clickLoginButton();
            productsPage.clickOnMenu();
        }


    @Then("the user can enter")
    public void theUserCanEnter() {
        productsPage.validateElement();

    }







}
