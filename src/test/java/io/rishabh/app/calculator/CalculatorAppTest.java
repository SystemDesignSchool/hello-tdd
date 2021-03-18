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

//    @Test
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