import java.util.ArrayList;
import java.util.Collections;

public class wrapperClassAssignment {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(90);
        marks.add(95);
        marks.add(80);
        marks.add(70);
        marks.add(93);
        int total = 0;
        System.out.println("Student Marks:");
        for(Integer mark:marks){
            System.out.println(mark);
        }
        
        for(Integer mark:marks){
            total=total+mark;
        }

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);
        double average=(double) total/marks.size();
        System.out.println("Total Marks:"+total);
        System.out.println("Average Marks:"+average);
        System.out.println("Highest Mark: "+highest);
        System.out.println("Lowest Mark: "+lowest);

        
    }
}


 