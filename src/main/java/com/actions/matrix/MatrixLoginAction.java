package com.actions.matrix;


import com.driver.$;
import com.pageObject.matrix.LoginPage;

public class MatrixLoginAction extends $ {

    public static void login(){
        $.get(LoginPage.matrixLoginUrl);
        jsonObject = LoginPage.getJson(LoginPage.d1);
        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("029527");
        jsonObject = LoginPage.getJson(LoginPage.d2);

        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("gtja@2020");

        jsonObject = LoginPage.getJson(LoginPage.d4);
        $.findElement(jsonObject);
        $.click();
    }


}