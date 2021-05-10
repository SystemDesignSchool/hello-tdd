# Java Cheat Sheet

## Array

```java
// Creating inline array
Command[] commands = new Command[]{addition, multiply, fib};  
  
```

## Reference of Inheritence

```java
Add addition = new Add();
// Add inherits Command

Command command = addition;

// Command is a superclass and Addition is a subclass. Thus the above assignment is valid, but the other way around is not.
```

## Question:

```java
// Defined a Main class:

package io.rishasi.playground.app;

public class Main {

    public static void main(String[] args) {

        Car maruti = new Car();
        maruti.setModel("Maruti123");
        maruti.setColor("Yellow");
        System.out.println(maruti.model);
        System.out.println(maruti.color);

        Car tata = new Car();
        System.out.println(tata.color);
        System.out.println(tata.model);
    }
}


// Defined the Car class

package io.rishasi.playground.app;

public class Car {

    public static String color = "White";
    public String model;
    private String engine;

    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
}


// Output on Running the Main method:

Maruti123
Yellow
Yellow     // Expected this to be White
null
  
// I expected the response to be "White" in the 3rd line. 
```

What happened here is that since the ```color``` variable had ```static``` entry with it, it is the property of the class.

the method ```setColor``` allows objects to <b>access</b> the class property, and edit it.

So when ```tata``` object is created, it will see the edited property, that is Yellow, and not White.

NOTE: If we remove, `static` from it, then we will see the Output as `White` because then the `color` field will belong to `objects` and not the `class`.

So each object will have it's own color property.



```java
public class Car {
    public static String engine;
}

public class Main {

    public static void main(String[] args) {

        Car.engine = "Red";
        Car maruti = new Car();
        System.out.println(maruti.engine + "\n");
      
        maruti.engine = "black";
        System.out.println(maruti.engine + "\n");
      
        System.out.println(Car.engine);

        Car tata = new Car();
        System.out.println(tata.engine);
    }
}

// Output:
Red
black
black


```

This tells that the `static` members can be edited directly, without a setter method.

I changed the property of a `class-member` from an Object.

<b> Ques:</b> Then what is the purpose of a setter function? Is setter and getter function normal functions or are they special?