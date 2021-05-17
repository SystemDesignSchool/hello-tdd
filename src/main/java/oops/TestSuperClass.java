package oops;

public class TestSuperClass {
}

class A{
    String color = "Ared";
    String supremeColor = "Yellow";
}

class B extends A{
    String color = "Bgreen";
}

class C extends B{
    String color = super.color;
    String anotherColor = super.supremeColor;
}