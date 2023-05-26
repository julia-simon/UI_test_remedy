package com.client.tests;

import com.github.javafaker.Faker;

public class TestData {
    public static Faker faker = new Faker();

    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            mobileNumber = faker.phoneNumber().subscriberNumber(10),
            referralName = faker.name().fullName();



}
