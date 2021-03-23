package io.rishabh.app.calculator;

public class Add {
    private int counter = 0;

    public boolean appliesTo(String input){

        String[] inputs = input.split(" ");
        String action = inputs[0];
        String parameters = inputs[1];

        if (action.equalsIgnoreCase("add") || action.equalsIgnoreCase("addition"))
        return true;
        else return false;
    }
    public String add(String values){
        int sum = 0;
        if(values.startsWith("log")){
            return Integer.toString(counter);
        }
        String[] eachValue = values.split(",");
        for(String obtainedValue : eachValue){
            sum += Integer.parseInt(obtainedValue);
        }
        counter++;
        return Integer.toString(sum);
    }
}
