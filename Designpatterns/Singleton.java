class Samosa {
    private static Samosa samosa;

    private Samosa() {

    }
    
    // Lazy way of creating single object
    public static Samosa getSamosa() {
        if (samosa == null) {
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }
        }
        return samosa;
    }
}
class Jalebi {
    // Eager way of creating single object

    private static Jalebi jalebi = new Jalebi();

    private Jalebi() {

    }

    public static Jalebi getJalebi() {
        return jalebi;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Samosa ob1 = Samosa.getSamosa();
        Samosa ob2 = Samosa.getSamosa();
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        Jalebi ob3 = Jalebi.getJalebi();
        Jalebi ob4 = Jalebi.getJalebi();
        System.out.println(ob3.hashCode());
        System.out.println(ob4.hashCode());
    }
}
