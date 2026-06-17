import java.util.ArrayList;

class Student {
    int studentid;
    String studentName;
    String department;

    Student(int studentid, String studentName, String department) {
        this.studentid = studentid;
        this.studentName = studentName;
        this.department = department;
    }

    void display() {
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
        System.out.println("----------------");
    }
}

public class studentdemo_arraywithObject {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Ram", "CSE"));
        students.add(new Student(102, "Kumar", "EEE"));
        students.add(new Student(103, "Sri", "IT"));

        for (Student student : students) {
            student.display();
        }
    }
}