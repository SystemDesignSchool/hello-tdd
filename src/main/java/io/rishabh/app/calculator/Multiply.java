package io.rishabh.app.calculator;

public class Multiply {
    public static String multiply(String values){
        int product = 1;
        String[] eachValue = values.split(",");
        for(String obtainedValue : eachValue){
            product = product * Integer.parseInt(obtainedValue);
        }
        return Integer.toString(product);
    }
}
