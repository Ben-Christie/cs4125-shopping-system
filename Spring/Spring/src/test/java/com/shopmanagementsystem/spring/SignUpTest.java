package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.util.AssertionErrors.assertEquals;


class SignUpTest {

    @Test
    void checkEmailAvailableTest() {
    checkEmailAvailable checkEmailisAvailable = new checkEmailAvailable();
    assertEquals(true || false, checkEmailisAvailable("test@test.com"));
    }

    @Test
    void createUserTest() {
        createUser createUserTest = new createUser();
        assertEquals(true || false, createUserTest("test@test.com"));
    }
}

