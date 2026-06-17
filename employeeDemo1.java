public class employeeDemo1 {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(110,"Maddy",50000);
        Employee1 emp2 = new Employee1(111,"Raghul",40000);
        emp1.display();
        emp2.display();
    }
}

//constructor

class Employee1
{
    int empid;
    String name;
    double salary;

    Employee1(int id ,String Empname , double empsalary)
    {
        empid=id;
        name=Empname;
        salary=empsalary;
    }
    void display()
    {
        System.out.println("Employee ID:"+empid);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary:"+salary);
        System.out.println("---------------------");
    }


}
