package oops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloOopsTest {
    @Test
    public void canAccessStaticMemberByClassName(){
        assertEquals(Car.wheelsCount, 4);
        assertEquals(Car.isVehicle, true);
    }

    @Test
    public void createsCarWithInstanceProperties(){
        var instanceOfCar = new Car();
        instanceOfCar.color = "red";
        instanceOfCar.registrationNumber = "UP65 786";
        instanceOfCar.isAutomatic = true;

        var anotherCar = new Car();
        anotherCar.color = "blue";
        anotherCar.registrationNumber = "DELHI 1234";
        anotherCar.isAutomatic = false;

        System.out.println(Car.isVehicle);
        System.out.println(instanceOfCar.color);
        System.out.println(instanceOfCar.isVehicle);
    }

    @Test
    public void defaultValueOfInstanceVariables(){
        var car = new Car();
        assertEquals(car.isAutomatic, true);
    }
}
