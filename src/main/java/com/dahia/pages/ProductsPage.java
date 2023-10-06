package com.dahia.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class ProductsPage extends PageObject {

    WebDriver driver;
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By menuButton = By.id("react-burger-menu-btn");
    By elementValidation = By.id("inventory_sidebar_link");

    public void clickOnMenu(){
        driver.findElement(menuButton).click();
    }

    public void validateElement(){
        assertTrue(driver.findElement(elementValidation).isDisplayed());
        String validationText = driver.findElement(elementValidation).getText();
        System.out.println(validationText);
        String cutText = driver.findElement(elementValidation).getText();
        String cadText = cutText.substring(4,8);
        System.out.println(cadText);
    }
}
