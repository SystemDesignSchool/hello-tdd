package io.rishabh.app.calculator;

/* Responsiblities:
    - Parse command
    - Add
    - Multiply
    - Find fibonacci
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
            return multiply(values);
        }

        if (action.equalsIgnoreCase("fib")) {
            return fibonacci(values);
        }
        return "Invalid command";
    }

    private String fibonacci(String values) {
        int length = Integer.parseInt(values);
        int[] fibArray = new int[length];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i  = 2; i < length; i++){
            fibArray[i] = fibArray[i-1] + fibArray [i-2];
        }

        return Integer.toString(fibArray[length-1]);
    }

    private String multiply(String values){
        int product = 1;
        String[] eachValue = values.split(",");
        for(String obtainedValue : eachValue){
            product = product * Integer.parseInt(obtainedValue);
        }
        return Integer.toString(product);
    }
}