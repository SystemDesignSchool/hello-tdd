package io.rishabh.app.calculator;

/* Responsiblities:
    - Parse command: Moved to each class
    - Based on command name, invoke correct method from correct class
    -
 */

public class CalculatorApp {

    private final Add addition;
    private final Multiply multiply;
    private final Fibonacci fib;

    public CalculatorApp(Add addition, Multiply multiply, Fibonacci fib){
        this.addition = addition;
        this.multiply = multiply;
        this.fib = fib;
    }

    public String execute(String command) {

        Command[] commandObj = new Command[3];
        commandObj[0] = addition;
        commandObj[1] = multiply;
        commandObj[2] = fib;

        for (int i = 0; i < commandObj.length; i++) {
            if(commandObj[i].appliesTo(command)){
                return commandObj[i].execute(command);
            }
        }

        return "Invalid command";
    }
}