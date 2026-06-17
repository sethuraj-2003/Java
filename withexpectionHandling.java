public class withexpectionHandling {
    public static void main(String[] args) {
        try{
            int salary = -1000;
            if(salary<=0)
            {
                System.out.println(10/0);
            }
        }
        catch(ArithmeticException ArithmeticException){
               System.out.println("Invalid Salary");
        }
        System.out.println("Employee Record Processed ");
    }
}
