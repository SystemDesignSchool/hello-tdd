package oops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloInheritenceTest {
    @Test
    public void shouldSupportAbstractClasses(){
        Animal animal = new Monkey() ;
        assertEquals(animal.getSpecies(), "Monkey");

        Animal otherAnimal = new Dog() ;
        assertEquals(otherAnimal.getSpecies(), "Dog");

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Monkey();
        animals[2] = new Rat();

        for(int i =0; i < animals.length; i++){
            System.out.println(animals[i].getSpecies());
        }
    }
}
