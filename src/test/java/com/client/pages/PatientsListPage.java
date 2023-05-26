package com.client.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PatientsListPage {
    // Selenide elements / locator / etc

    SelenideElement firstRow = $(".style_caseTableBody__hxbwZ").find(".style_caseTableRow__R8Bmw",0);


    // Actions

    public void verifyCreating (String value) {
        firstRow.shouldHave(Condition.text(value));
    }

}
