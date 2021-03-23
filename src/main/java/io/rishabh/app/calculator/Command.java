package io.rishabh.app.calculator;

public abstract class Command {
    public abstract boolean appliesTo(String input);
    public abstract String execute(String input);
}
