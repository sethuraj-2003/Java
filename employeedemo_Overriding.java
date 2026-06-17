class Employee {
    int empid;
    String name;
    double Salary;

    Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.Salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + Salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(int empid, String name, double salary, String programmingLanguage) {
        super(empid, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + Salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class employeedemo_Overriding {
    public static void main(String[] args) {
        Developer dev = new Developer(110, "Raghul", 40000, "Java");
        dev.display();
    }
}
