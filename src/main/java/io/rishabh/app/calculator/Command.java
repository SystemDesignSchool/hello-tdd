package io.rishabh.app.calculator;

public abstract class Command {
    public abstract boolean appliesTo(String inputs);
    public abstract String execute(String inputs);

}
