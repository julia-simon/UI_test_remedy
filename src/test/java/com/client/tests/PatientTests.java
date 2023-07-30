package com.client.tests;

import com.client.pages.PatientCreateAndEditFormPage;
import com.client.pages.PatientsListPage;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.client.tests.TestData.*;
import static com.client.tests.TestData.email;
import static io.qameta.allure.Allure.step;

public class PatientTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    PatientsListPage patientsListPage = new PatientsListPage();
    PatientCreateAndEditFormPage patientCreateAndEditFormPage = new PatientCreateAndEditFormPage();

    @Test
    @Tag("smoke")
    @DisplayName("Создание пациента")
    void createNewPatientTest() {
        step("Регистрация пользователя", () -> {
            registrationPage.openPage()
                    .setLogin(emailUser)
                    .setPassword(passwordUser)
                    .logIn();
        });
        step("Открытие формы создания пациента", () -> {
            patientsListPage.clickPatientList()
                    .clickPatientCreateButton();
        });
        step("Создание нового пациента", () -> {
            patientCreateAndEditFormPage.setFirstName(firstName)
                    .setLastName(lastName)
                    .setMobileNumber(mobileNumber)
                    .setEmail(email)
                    .setReferral(referralName)
                    .clickCreate();
        });

        step("Проверка появление пациента в таблице", () -> {
            patientsListPage.verifyResult(firstName)
                    .verifyResult(lastName)
                    .verifyResult(email);
        });
    }

    @Test
    @Tag("smoke")
    @DisplayName("Редактирование карточки пациента")
    void editPatientTest() {
        step("Авторизация пользователя", () -> {
            registrationPage.openPage()
                    .setLogin(emailUser)
                    .setPassword(passwordUser)
                    .logIn();
        });
        step("Открытие меню редактирование пациента", () -> {
            patientsListPage.clickPatientList()
                    .openPatientMenu()
                    .clickEditPatientButton();
        });
        step("Редактирование профиля пациента", () -> {
            patientCreateAndEditFormPage.setFirstName(firstName)
                    .setLastName(lastName)
                    .setMobileNumber(mobileNumber)
                    .setReferral(referralName)
                    .clickSave();
        });
        step("Проверка изменений профиля пациента", () -> {
            patientsListPage.verifyResult(firstName)
                    .verifyResult(lastName);
        });
    }
}