package io.rishabh.app.calculator;

// Represents a Command in CLI App.
public interface Command {
    // Should return 'true' if this object can execute the user input.
    boolean appliesTo(String input);

    // Executes the user input and returns result.
    String execute(String input);
}
