package com.client.tests;

import com.client.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class TestAddImaging extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void uploadImagingSuccessTest() {
        registrationPage.authorization();
        

    }

}
