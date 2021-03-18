package io.rishabh.app.calculator;

public class CalculatorApp {

    public String execute(String command){

        String[] inputs  = command.split(" ");
        String action = inputs[0];
        String values = inputs[1];

        if (action.equalsIgnoreCase("add")){
            return add(values);
        }

        if(action.equalsIgnoreCase("multiply")){
            return multiply(values);
        }
        return "Invalid command";
    }

    private String add(String values){
        int sum = 0;
        String[] eachValue = values.split(",");
        for(String obtainedValue : eachValue){
            sum += Integer.parseInt(obtainedValue);
        }
        return Integer.toString(sum);
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