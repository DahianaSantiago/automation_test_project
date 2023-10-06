package com.dahia.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    //Instanciar el web driver
    WebDriver driver;

    //Mapear
    By inputUserName = By.id("user-name");
    By inputPassword = By.id("password");
    By loginButton =By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(String user){
        driver.findElement(inputUserName).sendKeys(user);
    }

    public void enterPassword (String passwordEnter){
        driver.findElement(inputPassword).sendKeys(passwordEnter);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }


}
