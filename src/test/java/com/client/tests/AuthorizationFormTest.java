package com.client.tests;

import com.client.pages.HeaderInfo;
import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class AuthorizationFormTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    HeaderInfo headerInfo = new HeaderInfo();

@Test
@Tag("smoke")
    void succesFillLoginFormTest () {
        registrationPage.openPage()
                        .setLogin("julia.simonova@remedylogic.com")
                        .setPassword("RLogicJLS#123")
                        .logIn();
        headerInfo.checkUserName("Julia Simonova")
                    .menuSetting()
                        .logOutUser();
        registrationPage.checkRegistrationPage();

    }


}
