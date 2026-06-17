import java.util.ArrayList;

public class studentdemo_arraylist {
    public static void main(String[] args) {
        ArrayList<String> students=new ArrayList<>();
        students.add("Ram");
        students.add("Ravi");
        students.add("Priya");
        System.out.println("Student List");
        for(String student: students)
        {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Adding New Student");
        students.add("Kumar");
        for(String student:students){
            System.out.println(student);
        }
    }    
}
