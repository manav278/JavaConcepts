interface Cycle{
    int a=10;
    void speedUp();
    void applyBrake();
}
interface Horn {
    void slowHorn();
    void fastHorn();
}
class Avon implements Cycle,Horn{
    public void speedUp(){
        System.out.println("SpeedUp of Cycle is done...");
    }
    public void applyBrake(){
        System.out.println("Applybrake of Cycle is done...");
    }
    public void slowHorn(){
        System.out.println("Slow Horn");
    }
    public void fastHorn(){
        System.out.println("Fast Horn");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Avon obj=new Avon();
        System.out.println(obj.a);
        obj.applyBrake();
        obj.speedUp();
        obj.fastHorn();
        obj.slowHorn();
    }       
}

// We can create properties in Interface.
// All the properties in interface are final. So we can't modify it.
// We can implement more than one interface
// We can't extend more than one abstract class.
// class A extends B implements C
