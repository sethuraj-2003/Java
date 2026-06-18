package Week4;
import java.io.FileWriter;

public class employeeWriterdemo {
    public static void main(String[] args) {
        try
        {
            FileWriter writer = new FileWriter("employee1.txt");
            writer.write("Employee ID : 101\n");
            writer.write("Employee Name : Ram\n");
            writer.write("Salary : 50000\n");
            writer.close();
            System.out.println("Employee Data Saved");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
