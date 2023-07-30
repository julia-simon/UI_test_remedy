package com.client.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent {
    SelenideElement userName = $(".style_headerInfoName__ZmQl8"),
            headerInfoDown = $(".style_headerInfoDown__525aZ"),
            logOut = $(".style_iconLogOut__S9LnR");

    public void checkUserName(String value) {
        userName.shouldHave(text(value));
    }

    public void menuSetting() {
        headerInfoDown.click();
    }

    public void logOutUser() {
        logOut.click();
    }
}
