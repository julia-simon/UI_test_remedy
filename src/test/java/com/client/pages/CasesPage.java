package com.client.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CasesPage {
    // Selenide elements / locator / etc
    SelenideElement statusPendingReviewOpen = $(byText("Pending review"));

    // Actions
    public CasesPage selectCaseWithPendingReviewStatus() {
        statusPendingReviewOpen.click();

        return this;
    }


}
