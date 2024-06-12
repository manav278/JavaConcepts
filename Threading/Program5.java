class ThreadD extends Thread {

    public void run() {
        // int i = 0;
        // while (i < 20) {
        // System.out.println("Thankyou");
        // i++;
        // }
        while (true) {
            System.out.println("Thankyou");
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadE extends Thread {

    public void run() {
        // int i = 0;
        // while (i < 20) {
        // System.out.println("Welcome");
        // i++;
        // }
        while (true) {
            System.out.println("Welcome");
        }
    }
}

public class Program5 {
    public static void main(String[] args) {
        ThreadD obj1 = new ThreadD();
        ThreadE obj2 = new ThreadE();
        obj1.start();
        // try {
        // obj1.join();
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        obj2.start();
    }
}
