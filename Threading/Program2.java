class Thread1 implements Runnable{
    public void run(){
        for(int i=0;i<20;i++)
        {
            System.out.println("Thread1 implementing Runnable");
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        for(int i=0;i<20;i++)
        {
            System.out.println("Thread2 implementing Runnable");
        }
    }
}
public class Program2 {
    public static void main(String[] args) {
        Thread1 bullet1=new Thread1();
        Thread gun1=new Thread(bullet1);
        Thread2 bullet2=new Thread2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();      
    }
}
