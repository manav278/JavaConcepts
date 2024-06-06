interface Employee {
    int salary();
}

class Webdeveloper implements Employee {
    public int salary() {
        System.out.println("Webdeveloper's salary");
        return 60000;
    }
}

class Appdeveloper implements Employee {
    public int salary() {
        System.out.println("Appdeveloper's salary");
        return 70000;
    }
}

class Employeefactory {
    public static Employee getEmployee(String s) {
        if (s.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new Webdeveloper();
        } else if (s.trim().equalsIgnoreCase("APP DEVELOPER")) {
            return new Appdeveloper();
        } else {
            return null;
        }
    }
}

public class Factory {
    public static void main(String[] args) {
        Employee e = Employeefactory.getEmployee("APP DEVELOPER");
        System.out.println(e.salary());
    }
}
