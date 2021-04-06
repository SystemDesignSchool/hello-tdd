package io.rishabh.app.calculator;

/* Responsibilities:
    - Parse command: Moved to each class
    - Based on command name, invoke correct method from correct class
    -
 */

public class CalculatorApp {
    private final Command[] commands;

    public CalculatorApp(Add addition, Multiply multiply, Fibonacci fib){
        this.commands = new Command[]{addition, multiply, fib};
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