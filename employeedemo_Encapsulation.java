class Employee6
{
    private int empid;
    private String name;
    private double salary;

    Employee6(int empid, String name, double salary)
    {
        this.empid = empid;
        this.name = name;
        setSalary(salary);
    }

    void setSalary(double salary)
    {
        if (salary > 0)
        {
            this.salary = salary;
        }
        else
        {
            System.out.println("Invalid Salary");
        }
    }

    double getSalary()
    {
        return salary;
    }

    void display()
    {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class employeedemo_Encapsulation
{
    public static void main(String[] args)
    {
        Employee6 emp = new Employee6(110, "Raghul", 40000);
        emp.display();

        System.out.println();
        System.out.println("Salary using Getter: " + emp.getSalary());
    }
}