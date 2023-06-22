package com.client.tests;

import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class AddNoteTest extends TestBase2 {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @Tag("smoke")
        void addNewNoteTest() {
            registrationPage.authorization();
            $(byText("Pending review")).click();
            $(byText("Notes")).click();
            $(byTagName("textarea")).setValue("Hello!");
            $(byTagAndText("button","Save")).click();
            $(".style_ToastItemContainer__T9irP").shouldHave(text("Note successfully created."));
            $(".CaseNotes_note__psCRS").sibling(0).$(byTagName("textarea")).shouldHave(text("Hello!"));
    }


}
