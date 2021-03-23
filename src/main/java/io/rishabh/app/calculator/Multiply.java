package io.rishabh.app.calculator;

public class Multiply {
    private int counter = 0;

    public boolean appliesTo(String input){

        String[] inputs = input.split(" ");
        String action = inputs[0];

        if (action.equalsIgnoreCase("mul") || action.equalsIgnoreCase("multiply")){
            return true;
        }

        return false;
    }

    public String multiply(String values){
        int product = 1;

        if(values.startsWith("log")){
            return Integer.toString(counter);
        }

        String[] eachValue = values.split(",");
        for(String obtainedValue : eachValue){
            product = product * Integer.parseInt(obtainedValue);
        }
        counter++;
        return Integer.toString(product);
    }
}
