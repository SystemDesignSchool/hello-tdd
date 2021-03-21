package io.rishabh.app.calculator;

/* Responsiblities:
    - Parse command
    - Based on command name, invoke correct method from correct class
 */

public class CalculatorApp {

    public String execute(String command) {

        String[] inputs = command.split(" ");
        String action = inputs[0];
        String values = inputs[1];

        if (action.equalsIgnoreCase("add")) {
            return Add.add(values);
        }

        if (action.equalsIgnoreCase("multiply")) {
            return Multiply.multiply(values);
        }

        if (action.equalsIgnoreCase("fib")) {
            return Fibonacci.fibonacci(values);
        }
        return "Invalid command";
    }
}