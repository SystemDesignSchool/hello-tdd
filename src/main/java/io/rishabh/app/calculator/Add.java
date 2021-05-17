package io.rishabh.app.calculator;

public class Add extends Loggable implements Command {

    public boolean appliesTo(String input){

        String[] inputs = input.split(" ");
        String action = inputs[0];

        return action.equalsIgnoreCase("add") || action.equalsIgnoreCase("addition");
    }
    public String execute(String input){

        String[] inputs = input.split(" ");
        String parameters = inputs[1];

        int sum = 0;
        if(isLoggable(parameters)){
            return logCount(parameters);
        }

        String[] eachValue = parameters.split(",");
        for(String obtainedValue : eachValue){
            sum += Integer.parseInt(obtainedValue);
        }

        counter++;
        return Integer.toString(sum);
    }
}
