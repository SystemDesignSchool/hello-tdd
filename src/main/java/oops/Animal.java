package oops;

public abstract class Animal {
    public abstract String getSpecies();
}

class Monkey extends Animal {
    public String getSpecies(){
        return "Monkey";
    }
}

class Dog extends Animal {
    public String getSpecies(){
        return "Dog";
    }
}

class Rat extends Animal {
    public String getSpecies(){
        return "Rat";
    }
}
