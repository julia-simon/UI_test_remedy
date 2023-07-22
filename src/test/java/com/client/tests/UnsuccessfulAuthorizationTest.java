package com.client.tests;

import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class UnsuccessfulAuthorizationTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    @Tag("smoke")
    @DisplayName("Проверка ошибки при вводе неправильного пароля")
    void unsuccessFillLoginFormTest () {
        step("Авторизация пользователя", () -> {
        registrationPage.openPage()
                .setLogin(emailUser)
                .setPassword("123456")
                .logIn();
        });
        step("Проверка появления ошибки при вводе неправильного пароля", () -> {
            registrationPage.popupErrorMessage("An error has occurred");
        });
    }
}
