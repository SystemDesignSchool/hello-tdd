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

### Contract

Contract for `Command` class:

```java
// Represents a Command in CLI App.
public abstract class Command {
    // Should return 'true' if this object can execute the user input.
    public abstract boolean appliesTo(String input);

    // Executes the user input and returns result.
    public abstract String execute(String input);
}
```

Now this `Class` has only contract, no data and no behavior. So it makes sense to convert it to an `Interface`.

```java
// Represents a Command in CLI App.
public interface Command {
    // Should return 'true' if this object can execute the user input.
    public boolean appliesTo(String input);

    // Executes the user input and returns result.
    public String execute(String input);
}
```



---

### Class v/s Interface:

- Class has data, behaviour and contract.
- Interface has only contract.

---

### Constructor

- Constructor are just like methods, but with no return type.

  ```java
  // contructor has no return type
  protected Command(String[] alias){
  }
  
  // method has a return type
  protected void Command(String[] alias){     
  }
  ```

- Contructors are used to create Objects.

- Constructors are invoked either:

  - Using `new` keyword
  - Or, from Constructor of sub-class.

```java
public class TestConstructor {

    public static void main(String[] args) {
        FourWheeler fourWheeler = new FourWheeler();
        System.out.println("Constructors");
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Running Vehicle default constructor");
    }
}

class FourWheeler extends Vehicle{
    FourWheeler(){
        System.out.println("Four wheeler default constructor");
    }
}

//Output:
> Task :TestConstructor.main()
Running Vehicle default constructor
Four wheeler default constructor
Constructors
```

