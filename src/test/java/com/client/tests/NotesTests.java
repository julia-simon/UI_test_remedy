package com.client.tests;

import com.client.pages.CasePage;
import com.client.pages.DashboardPage;
import com.client.pages.NotesPage;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.client.tests.TestData.noteMassage;
import static io.qameta.allure.Allure.step;

public class NotesTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    DashboardPage dashboardPage = new DashboardPage();
    CasePage casePage = new CasePage();
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
            dashboardPage.selectCaseWithPendingReviewStatus();
        });
        step("Открытие заметок", () -> {
            casePage.openNotes();
        });
        step("Написание заметки", () -> {
            notesPage.enterNote(noteMassage)
                    .clickSaveButton();
        });

        step("Проверка сохранения и отображения заметки", () -> {
            notesPage
                    .successMassage("Note successfully created.")
                    .checkNote(noteMassage);
        });
    }

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
            dashboardPage.selectCaseWithPendingReviewStatus();
        });
        step("Открытие заметок", () -> {
            casePage.openNotes();
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
