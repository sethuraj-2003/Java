import java.util.HashMap;

class Student2
{
    int studentid;
    String studentName;
    String department;

    Student2(int studentid,String studentName,String department )
    {
        this.studentid=studentid;
        this.studentName=studentName;
        this.department=department;
    }

    void display()
    {
        System.out.println("Student ID:"+studentid);
        System.out.println("StudentName:"+studentName);
        System.out.println("Department:"+department);
    }

}

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Student2>studentMap=new HashMap<>();
        studentMap.put(101,new Student2(101,"Ram","ECE"));
        studentMap.put(102,new Student2(102, "Sri","IT"));
        studentMap.put(103, new Student2(103,"Vimal","EEE"));
        Student2 student = studentMap.get(102);
        student.display();
    }   
}
