package oops;

public class TestVariables{
    public static void main(String[] args) {
        int myNum1 = Variables.num1;
        System.out.println("Class variables are static and can be accessed without Initializing the class into an Object");
        System.out.println("Static Variable: " + myNum1);

        Variables var = new Variables();
        System.out.println("Instance Var: " + var.num2);

        System.out.println("Local Var: " + var.myNum());

    }
}
class Variables {
    static int num1 = 1;
    public int num2 = 2;
    public int myNum(){
        int num3 = 3;
        return num3;
    }
}

