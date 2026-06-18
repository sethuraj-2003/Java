
package Week4;

import java.io.FileWriter;
import java.io.FileReader;

public class readandwrite {
    public static void main(String[] args) {
        try (
            FileWriter writer = new FileWriter("employee.txt");
        ) {
            writer.write("Employee ID : 102\n");
            writer.write("Employee Name : Raghul\n");
            writer.write("Salary : 40000\n");

            System.out.println("Employee Data Saved");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (
            FileReader reader = new FileReader("employee.txt");
        ) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
