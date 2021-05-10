package io.rishabh.app.calculator;

public class Add extends Command{
    private int counter = 0;

    public boolean appliesTo(String input){

        String[] inputs = input.split(" ");
        String action = inputs[0];

        return action.equalsIgnoreCase("add") || action.equalsIgnoreCase("addition");
    }
    public String execute(String input){

        String[] inputs = input.split(" ");
        String parameters = inputs[1];

        int sum = 0;
        if(parameters.startsWith("log")){
            return Integer.toString(counter);
        }
        String[] eachValue = parameters.split(",");
        for(String obtainedValue : eachValue){
            sum += Integer.parseInt(obtainedValue);
        }
        counter++;
        return Integer.toString(sum);
    }
}
