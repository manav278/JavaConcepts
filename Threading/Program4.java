class ThreadC extends Thread {
    ThreadC(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            System.out.println("Thankyou " + this.getName());
        }
    }
}

public class Program4 {
    public static void main(String[] args) {
        ThreadC obj1 = new ThreadC("Thread1");
        ThreadC obj2 = new ThreadC("Thread2");
        ThreadC obj3 = new ThreadC("Thread3");
        ThreadC obj4 = new ThreadC("Thread4");
        ThreadC obj5 = new ThreadC("Thread5");
        ThreadC obj6 = new ThreadC("Thread6");
        obj6.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
        obj6.start();
    }
}
