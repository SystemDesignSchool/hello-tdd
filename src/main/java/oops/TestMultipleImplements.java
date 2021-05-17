package oops;

interface One{
    int giveANum();
}

interface Two extends One{
    String giveAString();
}

interface Four{
    void doSomething();
}

interface Three extends Two, Four{
    boolean working();
}
public class TestMultipleImplements implements Three {
    public int giveANum(){
        return 5;
    }
    public String giveAString(){
        return "Hi";
    }
    public boolean working(){
        return true;
    }
    public void doSomething(){
        System.out.println("Doing it");
    }
}
