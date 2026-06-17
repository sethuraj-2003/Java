import java.util.*;

class Student3 {
    int studentid;
    String studentName;
    String department;

    Student3(int studentid, String studentName, String department) {
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

public class assignment {
    public static void main(String[] args) {

        
        ArrayList<Student3> students = new ArrayList<>();

        students.add(new Student3(101, "Ram", "CSE"));
        students.add(new Student3(102, "Kumar", "EEE"));
        students.add(new Student3(103, "Sri", "IT"));

        System.out.println("ArrayList Students:");

        for (Student3 student : students) {
            student.display();
        }


        HashMap<Integer, Student3> studentMap = new HashMap<>();

        studentMap.put(101, new Student3(101, "Ram", "CSE"));
        studentMap.put(102, new Student3(102, "Kumar", "EEE"));
        studentMap.put(103, new Student3(103, "Sri", "IT"));

        System.out.println("HashMap Operations:");


        if (studentMap.containsKey(103)) {
            System.out.println("Student Found:");
            studentMap.get(103).display();
        }

        System.out.println("Contains Given ID : " + studentMap.containsKey(104));
        System.out.println("----------------");
 
        Student3 removed = studentMap.remove(101);

        if (removed != null) {
            System.out.println("Student Removed Successfully:");
            removed.display();
        } else {
            System.out.println("Student Not Found");
        }  
        }
    }