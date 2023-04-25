package com.client.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    // Selenide elements / locator / etc
    SelenideElement loginEmail = $(byName("email")),
                    password =  $(byName("password")),
                    buttonLogin =  $(byText("Log in")),
                    titleLogin =  $(".style_secRegistrationSubtitle__FbBQD");




    // Actions
    public RegistrationPage openPage() {
        open("https://client-app.remedy-dev.com/");

        return this;
    }

    public RegistrationPage checkRegistrationPage() {
        titleLogin.shouldHave(text("Surgeon Log in"));

        return this;
    }


    public RegistrationPage setLogin(String value) {
        loginEmail.setValue(value);

        return this;
    }

    public RegistrationPage setPassword(String value) {
        password.setValue(value);

        return this;
    }

    public RegistrationPage logIn() {
        buttonLogin.click();

        return this;
    }


}
