package com.client.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CasePage {
    SelenideElement notesButton = $(byText("Notes"));
    public CasePage openNotes() {
        notesButton.click();

        return this;
    }

}
