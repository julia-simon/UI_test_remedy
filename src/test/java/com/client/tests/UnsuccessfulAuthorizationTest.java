package com.client.tests;

import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class UnsuccessfulAuthorizationTest extends TestBase2{

    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    void unsuccessFillLoginFormTest () {
        registrationPage.openPage()
                .setLogin("julia.simonova@remedylogic.com")
                .setPassword("RLogicJLS#1236")
                .logIn();
        $(".ant-notification-topRight").shouldHave(text("An error has occurred"));
    }
}
