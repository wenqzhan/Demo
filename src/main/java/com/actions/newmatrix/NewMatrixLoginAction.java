package com.actions.newmatrix;

import com.driver.$;
import com.pageObject.newMatrix.NewLoginPage;
import com.pageObject.newMatrix.NewTopNavigator;

public class NewMatrixLoginAction extends $ {

    public static void login(){
        $.get(NewLoginPage.matrixLoginUrl);
        jsonObject = NewLoginPage.getJson(NewLoginPage.d1);
        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("999999");
        jsonObject = NewLoginPage.getJson(NewLoginPage.d2);

        $.findElement(jsonObject);
        $.clear();
        $.sendKeys("gtja@123456");

        jsonObject = NewLoginPage.getJson(NewLoginPage.d4);
        $.findElement(jsonObject);
        $.click();

        jsonObject = NewTopNavigator.getJson(NewTopNavigator.d2);
        $.findElement(jsonObject);
        //$.click();

        jsonObject = NewTopNavigator.getJson(NewTopNavigator.d4);
        $.findElement(jsonObject);
        $.click();

        jsonObject = NewTopNavigator.getJson(NewTopNavigator.d6);
        $.findElement(jsonObject);
        $.click();

    }


}
