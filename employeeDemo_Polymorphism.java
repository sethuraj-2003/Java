class Employee3 {
    int empid;
    String name;
    double Salary;

    Employee3(int empid, String name, double salary) {
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

class Developer3 extends Employee3 {
    String programmingLanguage;

    Developer3(int empid, String name, double salary, String programmingLanguage) {
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

class Tester extends Employee3 {
    String testingTool;

    Tester(int empid, String name, double salary, String testingTool) {
        super(empid, name, salary);
        this.testingTool = testingTool;
    }

    @Override
    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + Salary);
        System.out.println("Testing Tool: " + testingTool);
    }
}

public class employeeDemo_Polymorphism {
    public static void main(String[] args) {

        Employee3 emp;

        emp = new Developer3(110, "Raghul", 40000, "Java");
        emp.display();

        System.out.println();

        emp = new Tester(111, "Maddy", 50000, "Selenium");
        emp.display();
    }
}