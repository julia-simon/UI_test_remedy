package com.client.tests;

import com.client.config.CredentialsConfig;
import com.client.helper.Attach;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class TestBase {

    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class, System.getProperties());
    String emailUser = config.getLoginAccount();
    String passwordUser = config.getPasswordAccount();

    @BeforeAll()
        static void beforeAll() {
        Configuration.baseUrl = System.getProperty("baseUrl", "https://client-app.remedy-dev.com/");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        String[] browserAndVersion = System.getProperty("browser", "chrome:100.0").split(":");
        Configuration.browser = browserAndVersion[0];
        Configuration.browserVersion = browserAndVersion[1];
        WebDriverManager.chromedriver().setup();
        Configuration.remote = System.getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }
}
