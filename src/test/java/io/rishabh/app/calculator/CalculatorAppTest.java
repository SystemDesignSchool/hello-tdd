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
    void shouldKeepTrackOfCallsOfFibonacciCommand() {
        app.execute("fib 5");
        app.execute("fib 6");
        app.execute("fib 10");

        String command = "fib log-count";

        String actual = app.execute(command);
        String expected  = "3";
        assertEquals(expected, actual, command);
    }

    @Test
    void shouldKeepTrackOfCallsOfMultiplyCommand() {
        app.execute("multiply 5,6");
        app.execute("multiply 2,3");
        app.execute("multiply 1,1");
        app.execute("multiply 2,6");
        app.execute("multiply 8,3");

        String command = "multiply log-count";

        String actual = app.execute(command);
        String expected  = "5";
        assertEquals(expected, actual, command);
    }

    @Test
    void shouldKeepTrackOfCallsOfAddCommand() {
        app.execute("add 5,6");
        app.execute("add 2,3");

        String command = "add log-count";

        String actual = app.execute(command);
        String expected  = "2";
        assertEquals(expected, actual, command);
    }

    @Test
    void shouldFindFibonacci() {
        String command = "fib 10";
        String actual = app.execute(command);
        String expected  = "34";
        assertEquals(expected, actual, command);
    }

    @Test
    void shouldAddNumbers() {
        String command = "add 20,30,40";
        String actual = app.execute(command);
        String expected  = "90";
        assertEquals(expected, actual, command);
    }

    @Test
    void shouldSupportAdditionCommand() {
        String command = "addition 20,30,40";
        String actual = app.execute(command);
        String expected  = "90";
        assertEquals(expected, actual, command);
    }

    @Test
    void shouldMultiplyNumbers() {
        String command = "multiply 20,30,40";
        String actual = app.execute(command);
        String expected  = "24000";
        assertEquals(expected, actual, command);
    }

    @Test
    void shouldIgnoreLetterCaseInCommandName() {
        String[] commands = new String[]{
                "add 1,2,3",
                "Add 4,5,6",
                "aDD 7,8,9",
                "adD 10,11,12",
                "ADD 13,14,15",
        };

        String[] expectedOutputs  = new String[]{"6", "15", "24", "33", "42",};

        for(int i = 0 ; i < commands.length; i++){
            String command = commands[i];
            String expected = expectedOutputs[i];
            String actual = app.execute(command);
            assertEquals(expected, actual, command);
        }
    }
}