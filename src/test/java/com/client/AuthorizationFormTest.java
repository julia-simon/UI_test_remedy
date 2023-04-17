package com.client;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationFormTest extends TestBase {

@Test
    void succesFillLoginFormTest () {
        open("https://client-app.remedy-dev.com/");
        $(byName("email")).setValue("julia.simonova@remedylogic.com");
        $(byName("password")).setValue("RLogicJLS#123");
        $(byText("Log in")).click();
        $(".style_headerInfoName__ZmQl8").shouldHave(text("Julia Simonova"));
        $(".style_headerInfoDown__525aZ").click();
        $(".style_iconLogOut__S9LnR").click();
        $(".style_secRegistrationSubtitle__FbBQD").shouldHave(text("Surgeon Log in"));
    }


}
