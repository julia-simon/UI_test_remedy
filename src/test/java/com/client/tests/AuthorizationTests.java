package com.client.tests;

import com.client.pages.DashboardPage;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AuthorizationTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    @Tag("smoke")
    @DisplayName("Успешная авторизация пользователя")
    void successfulFillLoginFormTest() {
        step("Авторизация пользователя", () -> {
            registrationPage.openPage()
                    .setLogin(emailUser)
                    .setPassword(passwordUser)
                    .logIn();
        });
        step("Проверка отображения данных пользователя на странице", () -> {
            dashboardPage.checkUserName("Julia Simonova");
        });
    }

    @Test
    @Tag("smoke")
    @DisplayName("Проверка ошибки при вводе неправильного пароля")
    void unsuccessfulFillLoginFormTest() {
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

    @Test
    @Tag("smoke")
    @DisplayName("Проверка логаута")
    void logoutUserTest() {
        step("Авторизация пользователя", () -> {
            registrationPage.openPage()
                    .setLogin(emailUser)
                    .setPassword(passwordUser)
                    .logIn();
        });
        step("Открытие меню", () -> {
            dashboardPage.menuSetting()
                    .logOutUser();
        });
        step("Проверка логаута и редиректа на стартовую страницу", () -> {
            registrationPage.checkRegistrationPage();
        });
    }
}
