package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.util.AssertionErrors.assertEquals;


class LoginTest {

    @Test
    void verifyCredsTest() {
        verifyCreds verifyingCreds = new verifyCreds();
        assertEquals(true || false, verifyingCreds("test@test.com"));
    }

}
