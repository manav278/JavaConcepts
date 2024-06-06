class A {
    int a;

    A() {
        System.out.println("Default constructor of A called");
    }

    A(int a) {
        System.out.println("Paramaterized constructor of A called "+a);
    }
}

class B extends A {
    B() {
        super(10);
        System.out.println("Constructor B called");
    }
}

public class Superthis {
    public static void main(String[] args) {
       B obj=new B();
       
    }
}