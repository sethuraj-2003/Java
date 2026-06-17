class InvalidSalaryExpection extends Exception
{
   InvalidSalaryExpection(String Message)
   {
    super(Message);
   }
}

public class customExample {
    static void validateSalary(double salary) throws InvalidSalaryExpection
    {
        if(salary<=0)
        {
            throw new InvalidSalaryExpection("Salary must be greater than zero");

        }
    }
    public static void main(String[] args) {
        try{
            validateSalary(-5000);
        }
        catch(InvalidSalaryExpection e){
            System.out.println(e.getMessage());
        }
    }
}
