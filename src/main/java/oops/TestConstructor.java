package oops;

public class TestConstructor {

    public static void main(String[] args) {
        FourWheeler fourWheeler = new FourWheeler();
        FourWheeler anotherFourWheeler = new FourWheeler("Red");
        System.out.println("Four wheeler has " + fourWheeler.getNumOfWheels() + " wheels");
    }
}

class Vehicle{
    private int numOfWheels;
    Vehicle(int numOfWheels) {
        System.out.println("Vehicle has " + numOfWheels + " wheels");
    }
    Vehicle(String color){
        System.out.println("Color of vehicle is: " + color);
    }
    Vehicle(){
        this(4);
    }
    int getNumOfWheels(){
        return numOfWheels;
    }

}

class FourWheeler extends Vehicle{
    private String color;
    FourWheeler(){
        super(4);
        System.out.println("Four wheeler default constructor");
    }

    FourWheeler(String color){
        super(color);
        System.out.println("Four wheeler String constructor");
    }
}