package io.rishabh.app.calculator;

/* Responsiblities:
    - Parse command
    - Based on command name, invoke correct method from correct class
 */

public class CalculatorApp {

    private Add addition = new Add();
    private Multiply multiply = new Multiply();
    private Fibonacci fib = new Fibonacci();

    public String execute(String command) {

        String[] inputs = command.split(" ");
        String action = inputs[0];
        String values = inputs[1];
        
        if (addition.appliesTo(command)) {
            return addition.add(values);
        }

        if (action.equalsIgnoreCase("multiply") || action.equalsIgnoreCase("mul")) {
            return multiply.multiply(values);
        }

        if (action.equalsIgnoreCase("fib") || action.equalsIgnoreCase("fibonacci")) {
            return fib.fibonacci(values);
        }
        return "Invalid command";
    }
}