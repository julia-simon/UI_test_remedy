package com.client.tests;

import com.client.pages.PatientCreateAndEditFormPage;
import com.client.pages.RegistrationPage;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.client.tests.TestData.*;
import static com.client.tests.TestData.email;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.Keys.CONTROL;

public class EditPatientTest extends TestBase2 {
    RegistrationPage registrationPage = new RegistrationPage();
    PatientCreateAndEditFormPage patientCreateAndEditFormPage = new PatientCreateAndEditFormPage();

    @Test
    @Tag("smoke")
    void editPatientTest() {
        registrationPage.authorization();
        patientCreateAndEditFormPage.clickPatientList();
        $("button.style_caseTableAction__GjXvp").click();
        $(byText("Edit")).click();
        patientCreateAndEditFormPage.setFirstName(firstName);
        patientCreateAndEditFormPage.setLastName(lastName)
                .setMobileNumber(mobileNumber)
                .setEmail(email)
                .setReferral(referralName)
                .clickSave();
        patientCreateAndEditFormPage.verifyResult(firstName)
                .verifyResult(lastName)
                .verifyResult(firstName)
                .verifyResult(email);

    }

}
