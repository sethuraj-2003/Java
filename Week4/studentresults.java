package Week4;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;

public class studentresults {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));

            for (int i = 1; i <= 20; i++) {
                writer.write("Student ID : " + i);
                writer.newLine();

                writer.write("Student Name : Student" + i);
                writer.newLine();

                writer.write("Marks : " + (50 + i));
                writer.newLine();

                writer.newLine();
            }

            writer.close();

            System.out.println("20 Student Records Saved Successfully");
            System.out.println();
            System.out.println("Reading Student Records");
            System.out.println();

            BufferedReader reader = new BufferedReader(new FileReader("result.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}