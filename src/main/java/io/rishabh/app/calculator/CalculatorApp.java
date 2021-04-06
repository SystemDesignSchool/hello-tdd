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
        for (int i = 0; i < commands.length; i++) {
            if(commands[i].appliesTo(command)){
                return commands[i].execute(command);
            }
        }
        return "Invalid command";
    }
}