package com.client.tests;

import com.client.pages.HeaderInfoPage;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class LogoutTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    HeaderInfoPage headerInfo = new HeaderInfoPage();

    @Test
    @Tag("smoke")
    @DisplayName("Проверка логаута")
    void logoutUserTest () {
        step("Авторизация пользователя", () -> {
        registrationPage.openPage()
                .setLogin(emailUser)
                .setPassword(passwordUser)
                .logIn();
        });
        step("Открытие меню", () -> {
        headerInfo.menuSetting()
                .logOutUser();
        });
        step("Проверка логаута и редиректа на стартовую страницу", () -> {
        registrationPage.checkRegistrationPage();
        });
    }
}
