package com.client.tests;

import com.client.pages.PatientCreateAndEditFormPage;
import com.client.pages.PatientsListPage;
import com.client.pages.RegistrationPage;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.client.tests.TestData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.Keys.CONTROL;

public class CreatePatientTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    PatientCreateAndEditFormPage patientCreateAndEditFormPage = new PatientCreateAndEditFormPage();
    PatientsListPage patientsListPage = new PatientsListPage();


    @Test
    @Tag("smoke")
    void createNewPatientTest() {
        registrationPage.authorization();
        patientCreateAndEditFormPage.clickPatientList()
                .clickPatientCreateButton()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setMobileNumber(mobileNumber)
                .setEmail(email)
                .setReferral(referralName)
                .clickCreate();
        patientCreateAndEditFormPage.verifyResult(firstName)
                .verifyResult(lastName)
                .verifyResult(email);


       /* $(byText("Patients")).click();
        $(byText("Create patient")).click();
        $(byName("firstName")).setValue(firstName);
        $(byName("lastName")).setValue(lastName);
        $(byName("telNumber")).setValue(mobileNumber);
        $(byName("email")).setValue(email);
        $(byName("referral")).setValue(referralName);
        $(byName("firstName")).sendKeys(CONTROL, "a");
        $(byName("firstName")).setValue("TOM");
} */

    }
}

