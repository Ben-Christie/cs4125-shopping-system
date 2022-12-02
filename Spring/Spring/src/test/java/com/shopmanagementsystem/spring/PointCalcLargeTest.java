package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.util.AssertionErrors.assertEquals;


class PointCalcLargeTest {

    @Test
    void processTest() {
        process testingProcess = new process();
        assertEquals(-1 || 0, testingProcess("apples"));
    }

}
