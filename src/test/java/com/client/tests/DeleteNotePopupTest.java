package com.client.tests;

import com.client.pages.CasesPage;
import com.client.pages.NotesPage;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.Test;


public class DeleteNoteTest extends TestBase2 {
    RegistrationPage registrationPage = new RegistrationPage();
    CasesPage casesPage = new CasesPage();
    NotesPage notesPage = new NotesPage();

    @Test
    void deleteNoteTest() {
        registrationPage.openPage()
                .setLogin("julia.simonova@remedylogic.com")
                .setPassword("RLogicJLS#123")
                .logIn();
        casesPage.selectCaseWithPendingReviewStatus();
        notesPage.openNotes()
                .openEditMenu()
                .clickDeleteNoteButton()
                .successMassage("Note successfully deleted.");

    }
}
