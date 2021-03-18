package io.rishabh.app.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAppTest {
    private CalculatorApp app = new CalculatorApp();

    @Test
    void shouldDetectInvalidCommand() {
        String command = "kill yourself";
        String actual = app.execute(command);
        String expected = "Invalid command";
        assertEquals(expected, actual);
    }

    @Test
    void shouldAddNumbers() {
        String command = "add 20,30,40";
        String actual = app.execute(command);
        String expected  = "90";
        assertEquals(expected, actual);
    }
}