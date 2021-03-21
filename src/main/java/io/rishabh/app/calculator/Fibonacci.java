package io.rishabh.app.calculator;

public class Fibonacci {
    public static String fibonacci(String values) {
        int length = Integer.parseInt(values);
        int[] fibArray = new int[length];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i  = 2; i < length; i++){
            fibArray[i] = fibArray[i-1] + fibArray [i-2];
        }
        return Integer.toString(fibArray[length-1]);
    }
}
