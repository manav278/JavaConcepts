interface Employee {
    int salary();

    String name();
}

class Webdeveloper implements Employee {
    public int salary() {
        return 4000;
    }

    public String name() {
        return "Web Developer";
    }
}

class Appdeveloper implements Employee {
    public int salary() {
        return 5000;
    }

    public String name() {
        return "App Developer";
    }
}

abstract class AbstractEmployeeFactory {

    public abstract Employee createEmployee();

}

class Webdevfactory extends AbstractEmployeeFactory {
    public Employee createEmployee() {
        return new Webdeveloper();
    }
}

class Appdevfactory extends AbstractEmployeeFactory {
    public Employee createEmployee() {
        return new Appdeveloper();
    }
}

class EmployeeFactory {
    public static Employee getEmployee(AbstractEmployeeFactory obj) {
        return obj.createEmployee();
    }

}

public class Abstractfactory {
    public static void main(String[] args) {
        Employee emp1=EmployeeFactory.getEmployee(new Appdevfactory());
        System.out.println(emp1.name());
        System.out.println(emp1.salary());
    }

}
