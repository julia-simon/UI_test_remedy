package com.client.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HeaderInfoPage {
    // Selenide elements / locator / etc
    SelenideElement userName = $(".style_headerInfoName__ZmQl8"),
            headerInfoDown = $(".style_headerInfoDown__525aZ"),
            logOut = $(".style_iconLogOut__S9LnR");



    // Actions
    public HeaderInfoPage checkUserName(String value) {
        userName.shouldHave(text(value));

        return this;
    }

    public HeaderInfoPage menuSetting() {
        headerInfoDown.click();

        return this;
    }

    public HeaderInfoPage logOutUser() {
        logOut.click();

        return this;
    }

}
