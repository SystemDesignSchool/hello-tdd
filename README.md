# Classes and Objects

Class : is type

type : animal, kangaroo, car, maruti800

**static** : property of a type

```java
class Car {
  public static int getNumberOfWheels(){
    return 4;
  }
}

class Animal {
  public static boolean needsOxygentToSurvive(){
    return true;
  }
}


```



Object modeling for a car

- Properties of type (static properties)
  - `wheelsCount` : 4
  - `isVehicle` : true
- Properties of any specific car (instance properties)
  - `registrationNumber`
  - `color`
  - `isAutomatic`

```java
class Car{
	public static int wheelsCount = 4;
  public static boolean isVehicle = true;
  public String registrationNumber;
  public boolean isAutomatic;
  public String color;
}

Car.wheelsCount;
```



