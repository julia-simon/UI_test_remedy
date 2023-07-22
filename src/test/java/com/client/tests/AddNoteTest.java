package com.client.tests;

import com.client.pages.CasesPage;
import com.client.pages.NotesPage;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.client.tests.TestData.noteMassage;
import static io.qameta.allure.Allure.step;

public class AddNoteTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CasesPage casesPage = new CasesPage();
    NotesPage notesPage = new NotesPage();

    @Test
    @Tag("smoke")
    @DisplayName("Добавление заметки на странице приема пациента")
    void addNewNoteTest() {
        step("Авторизация пользователя", () -> {
        registrationPage.openPage()
                .setLogin(emailUser)
                .setPassword(passwordUser)
                .logIn();
        });
        step("Открытие страницы приема пациента", () -> {
        casesPage.selectCaseWithPendingReviewStatus();
        });
        step("Написание заметки", () -> {
        notesPage.openNotes()
                .enterNote(noteMassage)
                .clickSaveButton();
        });
        step("Проверка сохранения и отображения заметки", () -> {
            notesPage
                .successMassage("Note successfully created.")
                .checkNote(noteMassage);
        });
    }
}