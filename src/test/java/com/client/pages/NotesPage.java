package com.client.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class NotesPage {

    // Selenide elements / locator / etc
    SelenideElement notesButton = $(byText("Notes")),
            notesTextarea = $(byTagName("textarea")),
            saveButton = $(byTagAndText("button", "Save")),
            popupWindow = $(".style_ToastItemContainer__T9irP"),
            firstNoteArea = $(".CaseNotes_note__psCRS").sibling(0).$(byTagName("textarea")),
            editNotesMenu = $(byText("Edit")),
            deleteNoteButton =  $(byText("Delete"));


    // Actions
    public NotesPage openNotes() {
        notesButton.click();

        return this;
    }

    public NotesPage enterNote(String value) {
        notesTextarea.setValue(value);

        return this;
    }

    public NotesPage clickSaveButton() {
        saveButton.click();

        return this;
    }

    public NotesPage successMassage(String value) {
        popupWindow.shouldHave(text(value));

        return this;
    }

    public NotesPage checkNote(String value) {
        firstNoteArea.shouldHave(text(value));

        return this;
    }

    public NotesPage openEditMenu() {
        editNotesMenu.click();

        return this;
    }

    public NotesPage clickDeleteNoteButton() {
        deleteNoteButton.click();

        return this;
    }
}
