class Employee5 {

    void createEmployee() {
        System.out.println("Employee Created");
    }

    void createEmployee(int empid, String name) {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
    }

    void createEmployee(int empid, String name, double salary) {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class employeedemo_methodOverloading {

    public static void main(String[] args) {
        Employee5 emp = new Employee5();

        emp.createEmployee();
        emp.createEmployee(101, "Raghul");
        emp.createEmployee(102, "Ravi", 50000);
    }
}