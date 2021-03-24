package io.rishabh.app.calculator;

public class Multiply extends Command{
    private int counter = 0;

    public boolean appliesTo(String input){

        String[] inputs = input.split(" ");
        String action = inputs[0];

        return (action.equalsIgnoreCase("mul") || action.equalsIgnoreCase("multiply"));

    }

    public String execute(String input){

        String[] inputs = input.split(" ");
        String parameters = inputs[1];

        int product = 1;

        if(parameters.startsWith("log")){
            return Integer.toString(counter);
        }

        String[] eachValue = parameters.split(",");
        for(String obtainedValue : eachValue){
            product = product * Integer.parseInt(obtainedValue);
        }
        counter++;
        return Integer.toString(product);
    }
}
