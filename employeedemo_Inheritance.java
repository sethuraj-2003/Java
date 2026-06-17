class Employee1
{
    int empid;
    String name;
    double salary;

    Employee1(int empid,String name,double salary)
    {
      this.empid=empid;
      this.name=name;
      this.salary=salary;
    }
}

class Developer extends Employee1
{
    String programmingLanguage;
    Developer(int empid,String name,double salary,String programmingLanguage)
    {
        super(empid,name,salary);
        this.programmingLanguage=programmingLanguage;
    }

    void display()
    {
        System.out.println("Employee ID:"+empid);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary:"+salary);
        System.out.println("ProgrammingLanguage:"+programmingLanguage);
    }
}



public class employeedemo_Inheritance {
    public static void main(String[] args) {
        Developer dev = new Developer(110,"Raghul",40000,"Java");
        dev.display();
    }
}
