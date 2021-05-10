package io.rishabh.app.calculator;

/* Responsibilities:
    - Based on command name, invoke correct method from correct class
 */

public class CalculatorApp {
    private final Command[] commands;

    public CalculatorApp(Command[] commands){
        this.commands = commands;
    }

    public String execute(String command) {
        for (Command userCommand : commands){
            if (userCommand.appliesTo(command)){
                return userCommand.execute(command);
            }
        }
        return "Invalid command";
    }
}