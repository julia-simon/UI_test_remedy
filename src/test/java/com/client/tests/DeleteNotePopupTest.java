package com.client.tests;

import com.client.pages.CasesPage;
import com.client.pages.NotesPage;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class DeleteNotePopupTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CasesPage casesPage = new CasesPage();
    NotesPage notesPage = new NotesPage();

    @Test
    @Tag("smoke")
    @DisplayName("Проверка сообщения об удалении заметки")
    void deleteNoteTest() {
        step("Авторизация пользователя", () -> {
            registrationPage.openPage()
                    .setLogin(emailUser)
                    .setPassword(passwordUser)
                    .logIn();
        });
        step("Открытие страницы приема пациента", () -> {
            casesPage.selectCaseWithPendingReviewStatus();
        });
        step("Открытие заметок", () -> {
            notesPage.openNotes();
        });
        step("Удаление заметки", () -> {
            notesPage.openEditMenu()
                    .clickDeleteNoteButton();
        });
        step("Проверка появления сообщения об успешном удалении заметки", () -> {
            notesPage.successMassage("Note successfully deleted.");
        });
    }
}
