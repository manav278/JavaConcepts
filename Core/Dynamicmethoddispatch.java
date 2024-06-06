class Superclass {
    public void method1() {
        System.out.println("Method 1 in Superclass...");
    }

    public void method2() {
        System.out.println("Method 2 in Superclass...");
    }
}

class Subclass extends Superclass {
    public void method1() {
        System.out.println("Method 1 in Subclass...");
    }

    public void method3() {
        System.out.println("Method 3 in Subclass...");
    }
}

public class Dynamicmethoddispatch {
    public static void main(String[] args) {
        Superclass obj = new Subclass();
        obj.method1();
        obj.method2();
        // obj.method3(); -> Not possible
    }
}
