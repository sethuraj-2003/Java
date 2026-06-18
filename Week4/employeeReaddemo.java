package Week4;

import java.io.FileReader;

public class employeeReaddemo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("employee1.txt");
            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}