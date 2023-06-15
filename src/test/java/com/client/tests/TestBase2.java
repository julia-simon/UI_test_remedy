package com.client.tests;

import com.client.helper.Attach;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;


public class TestBase2 {
    @BeforeAll()
        static void beforeAll() {
        Configuration.baseUrl = "https://client-app.remedy-dev.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "Chrome";
        Configuration.timeout = 3000;
        Configuration.holdBrowserOpen = true;
    }
}
