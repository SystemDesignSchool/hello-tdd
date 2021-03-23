package io.rishabh.app.calculator;

public class Fibonacci {
    private int counter = 0;

    public boolean appliesTo(String input){

        String[] inputs = input.split(" ");
        String action = inputs[0];

        if(action.equalsIgnoreCase("fib") || action.equalsIgnoreCase("fibonacci")){
            return true;
        }
        return false;
    }

    public String fibonacci(String input) {

        String[] inputs = input.split(" ");
        String parameters = inputs[1];

        if(parameters.startsWith("log")){
            return Integer.toString(counter);
        }

        int length = Integer.parseInt(parameters);
        int[] fibArray = new int[length];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i  = 2; i < length; i++){
            fibArray[i] = fibArray[i-1] + fibArray [i-2];
        }
        counter ++;
        return Integer.toString(fibArray[length-1]);
    }
}
