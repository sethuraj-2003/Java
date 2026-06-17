import java.util.HashSet;

public class hashsetexample {
    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Python");     
        courses.add("Spring Boot");
        courses.add("Python");    

        System.out.println("Registered Courses");
        for (String course : courses) {
            System.out.println(course);
        }

        System.out.println();

        if (courses.contains("Java")) {
            System.out.println("Java Course Available");
        }

        System.out.println();

        courses.remove("Python");

        System.out.println("After Removing Python");
        for (String course : courses) {
            System.out.println(course);
        }

        System.out.println();
        System.out.println("Total Courses: " + courses.size());
    }
}