package oops;

public class TestSuperSub {
    public static void main (String[] args){
        SuperClass sup = new SubClass();
        SuperClass sup2 = new SuperClass();
        SubClass sub = new SubClass();
        System.out.println(sup.getName());
        System.out.println(sup2.getName());
        System.out.println(sub.getAnotherName());

        SuperAbstractClass supAbs = new SubAbstractClass();
        System.out.println(supAbs.getName());
    }
}

class SuperClass{
    public String getName(){
        return "Super";
    }
}

class SubClass extends SuperClass{
    public String getName(){
        return "Sub";
    }
    public String getAnotherName(){
        return "anotherSub";
    }
}

abstract class SuperAbstractClass{
    abstract public String getName();
}

class SubAbstractClass extends SuperAbstractClass{
    public String getName(){
        return "SubAbstract";
    }
}

// This is because through Polymorphism, we can substitute the SuperClass, where SubClass is expected.
// Now we have the remote (methods and variables) of type SuperClass in reference variable "sup" and "sup2",
// and are calling the getName() method. Now the SubClass has over-ridden this method. When we call this,
// the compiler will see which is the most specific getName(), and then it is called, i.e. of the SubClass,
// as both Super and Sub class has this method.
// Both having the method is that both classes have the same signature for that method. The getName() method is
// overridden, not overloaded.

// In line 6: SuperClass sup2 = new SuperClass();
// The sup2 reference is of SuperClass type and the Object that it refers to is also of SuperClass, thus the
// getName() method of SuperClass is called.

// I have also added another method in the SubClass.
// With reference variable "sup" and "sup2", which is of type SuperClass, we cannot call a method which is of
// type SubClass, as the remote of SuperClass does not know about the other method SubClass has.
// To execute the other method of SubClass, we will need reference variable of type SubClass...
// ...as shown in line 7 and 10.

// In case of Abstract class, the Abstract method has no implementation. The SubClass overrides it, and that
// is called.

// If remote and Object, both have the same method,
// when we call the method, the most specific implementation is called.
// If remote is not aware