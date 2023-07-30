package com.client.pages;

import com.client.pages.components.HeaderComponent;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    HeaderComponent headerComponent = new HeaderComponent();
    SelenideElement statusPendingReviewOpen = $(byText("Pending review"));

    public DashboardPage selectCaseWithPendingReviewStatus() {
        statusPendingReviewOpen.click();

        return this;
    }

    public DashboardPage checkUserName(String value) {
        headerComponent.checkUserName(value);

        return this;
    }

    public DashboardPage menuSetting() {
        headerComponent.menuSetting();

        return this;
    }

    public DashboardPage logOutUser() {
        headerComponent.logOutUser();

        return this;
    }
}


