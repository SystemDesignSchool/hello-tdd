package io.rishabh.app.calculator;

// Represents a Command in CLI App.
public abstract class Command {
    // Should return 'true' if this object can execute the user input.
    abstract boolean appliesTo(String input);

    // Executes the user input and returns result.
    abstract String execute(String input);
}
