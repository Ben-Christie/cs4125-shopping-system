package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.util.AssertionErrors.assertEquals;


class PointCalcMediumTest {

    @Test
    void processTest() {
        var testingProcess = new process();
        assertEquals(0, testingProcess("strawberries"));
    }

}
