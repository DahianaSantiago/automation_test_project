package com.bloom.pages;

import com.bloom.Models.Login;
import com.bloom.utils.UtilsCSV;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import static com.bloom.utils.Enums.EnumNombresCsv.LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginPage extends PageObject {

    private final Login data;
    private final String userData;


    public LoginPage(String idFilter, String userData) {
        data = new Login (UtilsCSV.obtenerPrimerDatoPrueba(LOGIN.getNombre(),idFilter));
        this.userData = userData;
    }

     private static Performable instrumented(Class<LoginPage> loginPageClass, String idFilter, String userData) {
        return instrumented(LoginPage.class, idFilter, userData);
    }

    @FindBy(id = "user-name")
    WebElementFacade inputName;

    @FindBy(xpath = "//input[@id='password']")
    WebElementFacade inputPassword;

    @FindBy(id = "login-button")
    WebElementFacade button;

    public void enterUser(){
        inputName.type(data.getUserName());
    }

    public void enterPassword(){
        inputPassword.type(data.getPassword());
    }

    public void clickLogin(){
        button.click();
    }
}
