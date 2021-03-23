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



### Object Oriented Prinicples

- **Encapsulation**
- **Inheritence**
- **Polymorphism**
- **Abstraction**



### SOLID Principles

> Design principles for good object oriented design.
>
> Think about it when you create a class.

- **S** : Single Responsibility Principle

  > For any class that you define, can you clearly write one responsibility that it has.
  >
  > Classes doing all kind of things are **Managers**, and ***good prograamers hate managers.***

- **O** : Open/Close Principle

  > Classes should be open for extension but closed for modification

- **L:** Liskov Substitution

  > Type can replace sub-type

- **I  :** Interface seggregation

- **D :** Dependency inversion



```
add 2,2
mult 3,4
add log-count

```



```
App
- received user input
- and invokes correct command
```



```java
Constructor: create objects

class MyClass{
  
  // Same as class name
  // No return type
  private string name;
  
  public MyClass(string name){
    this.name = name;
  }
  
	public static string sayHelloStatic(string name){
    	return "hello-static " + name;
  }
  
  public string sayHelloInstance(string name){
	    return "hello-instance " + this.name  ;
  }
}
```



```java
// Static
string message = MyClass.sayHelloStatic("rishasi");

// Instance
MyClass myObject = new MyClass(); // Default constructor
string message = myObjet.sayHelloInstance("rishasi");

// Constructor
MyClass object = new MyClass("rishasi");
string messgae = object.sayHelloInstance("singh");
// message = hello-instance rishasi
```





```java
class Car {
	
}

class IndianCar extends Car{
  
}

class Truck{
  
}

Car car = new Car();
car = new IndianCar();
```

