package io.rishabh.app.calculator;

public class CalculatorApp {

    public String execute(String command){

        String[] inputFromUser  = command.split(" ");
        String inputCommand = inputFromUser[0];
        String values = inputFromUser[1];
        int product = 1;

        if (inputCommand.equalsIgnoreCase("add")){
            return addNumbers(values);
        }

        if(inputCommand.equalsIgnoreCase("multiply")){
            return multiplyNumbers(values);
        }
        return "Invalid command";
    }

    private String addNumbers(String values){
        int sum = 0;
        String[] eachValue = values.split(",");
        for(String myValue : eachValue){
            sum += Integer.parseInt(myValue);
        }
        return Integer.toString(sum);
    }

    private String multiplyNumbers(String values){
        int product = 1;
        String[] eachValue = values.split(",");
        for(String myValue : eachValue){
            product = product * Integer.parseInt(myValue);
        }
        return Integer.toString(product);
    }
}