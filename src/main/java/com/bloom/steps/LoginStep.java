package com.bloom.steps;

import com.bloom.pages.LoginPage;
import com.bloom.utils.UtilsCSV;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;

import java.util.Map;

import static com.bloom.utils.Enums.EnumNombresCsv.LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginStep extends PageObject {


    @Page
    LoginPage loginPage;

    public LoginStep(Map<String, String> stringStringMap) {
    }

    @Step
    public void openBrowse() {
        loginPage.open();
    }

    @Step
    public void login() {
        loginPage.enterUser();
        loginPage.enterPassword();
        loginPage.clickLogin();
    }


}
