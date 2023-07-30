package com.client.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class PatientsListPage {
    SelenideElement patientListButton = $(byText("Patients")),
            newPatientCreateButton = $(byText("Create patient")),
            patientMenu = $("button.style_caseTableAction__GjXvp"),
            editPatientButton = $(byText("Edit")),
            firstRow = $(".style_caseTableBody__hxbwZ").find(".style_caseTableRow__R8Bmw", 0);

    public PatientsListPage clickPatientList() {
        patientListButton.click();

        return this;
    }

    public PatientsListPage openPatientMenu() {
        patientMenu.click();

        return this;
    }

    public PatientsListPage clickEditPatientButton() {
        editPatientButton.click();

        return this;
    }

    public PatientsListPage clickPatientCreateButton() {
        newPatientCreateButton.click();

        return this;
    }
    public PatientsListPage verifyResult(String value) {
        firstRow.shouldHave(Condition.text(value));

        return this;
    }
}
