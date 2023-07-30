package com.client.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PatientCreateAndEditFormPage {
    PatientsListPage patientsListPage = new PatientsListPage();
    SelenideElement firstNameInput = $(byName("firstName")),
            lastNameInput = $(byName("lastName")),
            telNumberInput = $(byName("telNumber")),
            emailInput = $(byName("email")),
            referralInput = $(byName("referral")),
            cancelButton = $(byText("Cancel")),
            createButton = $(byText("Create")),
            saveButton = $(byText("Save"));


    public PatientCreateAndEditFormPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public PatientCreateAndEditFormPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public PatientCreateAndEditFormPage setMobileNumber(String value) {
        telNumberInput.setValue(value);

        return this;
    }

    public PatientCreateAndEditFormPage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public PatientCreateAndEditFormPage setReferral(String value) {
        referralInput.setValue(value);

        return this;
    }

    public PatientCreateAndEditFormPage clickCreate() {
        createButton.click();

        return this;
    }

    public PatientCreateAndEditFormPage clickSave() {
        saveButton.click();

        return this;
    }
}
