package com.client.tests;

import com.client.pages.HeaderInfoPage;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class AuthorizationFormTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    HeaderInfoPage headerInfo = new HeaderInfoPage();

@Test
@Tag("smoke")
@DisplayName("Успешная авторизация пользователя")
    void succesFillLoginFormTest () {
    step("Авторизация пользователя", () -> {
    registrationPage.openPage()
                        .setLogin(emailUser)
                        .setPassword(passwordUser)
                        .logIn();
    });
    step("Проверка отображения данных пользователя на странице", () -> {
        headerInfo.checkUserName("Julia Simonova");
    });
    }
}
