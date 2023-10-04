package com.dahia;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    @Test
    public void loginInOrangeHrm() {
        // Configurar la ubicación del controlador de Chrome (webdriver)
        System.setProperty("web-driver.chrome.driver","chrome.exe");

        // Inicializar el navegador
        WebDriver driver = new ChromeDriver();

        // Abrir una página web
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Realizar acciones en la página (por ejemplo, hacer clic en un enlace, llenar un formulario, etc.)

        // Cerrar el navegador
        driver.quit();
    }
}
