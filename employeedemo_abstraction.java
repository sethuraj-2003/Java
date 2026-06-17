abstract class Employee7 {
    int empid;
    String name;
    double Salary;

    Employee7(int empid, String name, double Salary) {
        this.empid = empid;
        this.name = name;
        this.Salary = Salary;
    }

    abstract void work();

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + Salary);
    }
}

class Developer1 extends Employee7 {

    Developer1(int empid, String name, double Salary) {
        super(empid, name, Salary);
    }

    @Override
    void work() {
        System.out.println(name + " develops Java applications");
    }
}

public class employeedemo_abstraction {
    public static void main(String[] args) {
        Developer1 dev = new Developer1(110, "Raghul", 40000);
        dev.display();
        System.out.println();
        dev.work();
    }
}