package com.bloom.Models;

import lombok.Getter;

import java.util.Map;

public class Login {
    @Getter private String userName;
    @Getter private String password;

    public Login (Map<String,String> mapLogin){
        userName = mapLogin.get("Username");
        password = mapLogin.get("password");
    }
}
