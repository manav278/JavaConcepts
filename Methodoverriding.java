class A {
    public void method1() {
        System.out.println("Method 1 of class A is called");
    }

    public void method2() {
        System.out.println("Method 2 of class A is called");
    }
}

class B extends A {
    public void method2() {
        System.out.println("Method 2 of class B is called");
    }

    public void method3() {
        System.out.println("Method 3 of class B is called");
    }
}

public class Methodoverriding {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.method2();
        obj2.method2();
    }
}
