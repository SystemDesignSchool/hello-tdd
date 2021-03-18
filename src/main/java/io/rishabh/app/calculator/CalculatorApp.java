package io.rishabh.app.calculator;

public class CalculatorApp {

    public String execute(String command){

        String[] inputFromUser  = command.split(" ");
        String inputCommand = inputFromUser[0];
        String values = inputFromUser[1];

        if (inputCommand.equals("add")){
            return "90";
        }
        return "Invalid command";
    }
}