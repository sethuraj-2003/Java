class Employee
{
    int empid;
    String name;
    double salary;

    void display(){
        System.out.println("Employee ID:"+empid);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary:"+salary);
        System.out.println("---------------------");
    }
}


public class employeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.empid=110;
        emp1.name="Maddy";
        emp1.salary=50000;

        Employee emp2 = new Employee();
        emp2.empid=111;
        emp2.name="Raghul";
        emp2.salary=40000;

        emp1.display();
        emp2.display();
    }
}
