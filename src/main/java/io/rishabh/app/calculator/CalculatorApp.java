package io.rishabh.app.calculator;

/* Responsiblities:
    - Parse command: Moved to each class
    - Based on command name, invoke correct method from correct class
    -
 */

public class CalculatorApp {

    private Add addition = new Add();
    private Multiply multiply = new Multiply();
    private Fibonacci fib = new Fibonacci();

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