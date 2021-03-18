package io.rishabh.app.calculator;

public class CalculatorApp {

    public String execute(String command){

        String[] inputFromUser  = command.split(" ");
        String inputCommand = inputFromUser[0];
        String values = inputFromUser[1];
        int sum = 0;
        int product = 1;

        if (inputCommand.equalsIgnoreCase("add")){
            String[] eachValue = values.split(",");
            for(String myValue : eachValue){
                sum += Integer.parseInt(myValue);
            };
            return Integer.toString(sum);
        }

        if(inputCommand.equalsIgnoreCase("multiply")){
            String[] eachValue = values.split(",");
            for (String myValue : eachValue){
                product = product * Integer.parseInt(myValue);
            }
            return Integer.toString(product);
        }
        return "Invalid command";
    }
}