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

        if (action.equalsIgnoreCase("add") || action.equalsIgnoreCase("addition")) {
            return addition.add(values);
        }

        if (action.equalsIgnoreCase("multiply")) {
            return multiply.multiply(values);
        }

        if (action.equalsIgnoreCase("fib")) {
            return fib.fibonacci(values);
        }
        return "Invalid command";
    }
}