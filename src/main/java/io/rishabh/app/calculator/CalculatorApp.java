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

    public CalculatorApp(Add addition, Multiply multiply, Fibonacci fib  ){
        this.addition = addition;
        this.multiply = multiply;
        this.fib = fib;
    }

    public String execute(String command) {

        if (addition.appliesTo(command)) {
            return addition.add(command);
        }

        if (multiply.appliesTo(command)) {
            return multiply.multiply(command);
        }

        if (fib.appliesTo(command)) {
            return fib.fibonacci(command);
        }
        return "Invalid command";
    }
}