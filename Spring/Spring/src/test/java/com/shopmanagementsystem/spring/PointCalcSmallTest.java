package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;


class PointCalcSmallTest {

    @Test
    void processTest() {
        var testingProcess = new process();
        assertEquals(0, testingProcess("oranges"));
    }

}