package com.dahia;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Login {

    @Test
    public void loginInOrangeHrm()  {
        // Configurar la ubicación del controlador de Chrome (webdriver)
        //System.getProperty();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Inicializar el navegador
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);

        // Abrir una página web
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Buscar elemento
        WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
        String userValidation = "Joa Caseres";

        // Realizar acciones
        userName.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();

        //Mapeo
        WebElement loginValidation = wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//p[@class='oxd-userdropdown-name']")));

        assertTrue(loginValidation.isEnabled());
        System.out.println(loginValidation.getText());

        // Cerrar el navegador
        driver.quit();
    }
}
