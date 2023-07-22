package com.client.tests;

import com.client.pages.PatientCreateAndEditFormPage;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.client.tests.TestData.*;
import static com.client.tests.TestData.email;
import static io.qameta.allure.Allure.step;


public class EditPatientTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    PatientCreateAndEditFormPage patientCreateAndEditFormPage = new PatientCreateAndEditFormPage();

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
        patientCreateAndEditFormPage.clickPatientList()
                .openPatientMenu()
                .clickEditPatientButton();
        });
        step("Редактирование профиля пациента", () -> {
        patientCreateAndEditFormPage.setFirstName(firstName)
                .setLastName(lastName)
                .setMobileNumber(mobileNumber)
                .setEmail(email)
                .setReferral(referralName)
                .clickSave();
        });
        step("Проверка изменений профиля пациента", () -> {
        patientCreateAndEditFormPage.verifyResult(firstName)
                .verifyResult(lastName)
                .verifyResult(firstName)
                .verifyResult(email);
        });
    }
}
