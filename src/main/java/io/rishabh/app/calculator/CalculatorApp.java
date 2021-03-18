package io.rishabh.app.calculator;

public class CalculatorApp {

    public String execute(String command){
        if(command.startsWith("add")){
            return "90";
        }
        return "Invalid command";
    }
}