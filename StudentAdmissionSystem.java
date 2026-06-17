import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Admission denied! Age must be 18 or above.");
        }

        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Admission Successful!");
    }
}

public class StudentAdmissionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();

            Student student = new Student(name, age);

            student.displayDetails();

        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            sc.close();
        }
    }
}