package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;


class LoginTest {

    @Test
    void verifyCredsTest() {
        var verifyingCreds = new verifyCreds();
        assertEquals(true || false, verifyingCreds("test@test.com"));
    }

}