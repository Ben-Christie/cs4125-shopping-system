package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;


class SignUpTest {

    @Test
    void checkEmailAvailableTest() {
    var checkEmailisAvailable = new checkEmailAvailable();
    assertEquals(true || false, checkEmailisAvailable("test@test.com"));
    }

    @Test
    void createUserTest() {
        var createUserTest = new createUser();
        assertEquals(true || false, createUserTest("test@test.com"));
    }
}

