import java.util.HashSet;

public class collegeregistration {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        students.add("Raj Surya");
        students.add("Subhashri");
        students.add("Vignesh");
        students.add("Raghul");
        students.add("Soundariya");
        students.add("Raj Surya");
        students.add("Soundariya");

        System.out.println("Registered Students");
        for(String student:students){
        System.out.println(student);
        }
        System.out.println();

        if(students.contains("Raj Surya")){
            System.out.println("Raj Surya is registered");
        }
        System.out.println();

        students.remove("Soundariya");

        System.out.println("After Removing Soundariya");
        for(String student :students){
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Total Number odf Students Registered: "+students.size());
    }
}
