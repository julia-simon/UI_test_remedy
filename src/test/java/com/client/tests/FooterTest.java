package com.client.tests;

import com.client.pages.RegistrationPage;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;


public class FooterTest {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test

    void footerInfoTest () {
        registrationPage.authorization();
        $(".style_appFooterPolicy__kt5MX").shouldHave(Condition.text("© RemedyLogic. All Rights Reserved. 2023"));
        $(byText("About")).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://remedylogic.com/"));
        switchTo().window(0);
       $(byText("Contact Us")).shouldHave(Condition.attribute("href", "mailto:remedy@remedylogic.com"));

    }
}
