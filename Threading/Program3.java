class ThreadA extends Thread {
    ThreadA(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thankyou");
    }
}

class ThreadB extends Thread {
    ThreadB(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thankyou");
    }
}

public class Program3 {
    public static void main(String[] args) {
        ThreadA obj1 = new ThreadA("ThreadA");
        ThreadA obj2 = new ThreadA("ThreadB");
        obj1.start();
        obj2.start();
        System.out.println("The id of thread obj1 is " + obj1.getId());
        System.out.println("The name of thread obj1 is " + obj1.getName());
        System.out.println("The id of thread obj2 is " + obj2.getId());
        System.out.println("The name of thread obj2 is " + obj2.getName());
    }
}