package io.rishabh.app.calculator;

public class Multiply {
    private int counter = 0;

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
