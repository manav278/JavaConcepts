abstract class Parent {
    public void bye() {
        System.out.println("Bye everyone");
    }

    abstract public void hello();
}

// --------------------------------------

class Child1 extends Parent {
    public void thankyou() {
        System.out.println("Thankyou");
    }

    public void hello() {
        System.out.println("Hello Everyaone");
    }
}

// --------------------------------------

abstract class Child2 extends Parent {
    public void welcome() {
        System.out.println("Welcome everyone");
    }
}

public class Abstractclass {
    public static void main(String[] args) {
        Child1 c=new Child1();
        c.bye();
        c.hello();
        c.thankyou();
    }

}
