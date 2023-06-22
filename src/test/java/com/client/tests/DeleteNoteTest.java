package com.client.tests;

import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DeleteNoteTest extends TestBase2 {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void deleteNoteTest() {
        registrationPage.authorization();
        $(byText("Pending review")).click();
        $(byText("Notes")).click();
        $(byText("Edit")).hover();
        $(byText("Delete")).click();
        $(".style_ToastItemContainer__T9irP").shouldHave(text("Note successfully deleted."));
    }
}
