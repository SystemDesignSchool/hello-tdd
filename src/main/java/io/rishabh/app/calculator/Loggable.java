package io.rishabh.app.calculator;

abstract class Loggable {
    int counter = 0;
    public boolean isLoggable(String params){
        if(params.startsWith("log")){
            return true;
        }
        return false;
    }
    public String logCount(String params){
        return Integer.toString(counter);
    }
}
