import java.util.ArrayList;

public class studentMarkwrapperclass {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(90);
        marks.add(95);
        marks.add(80);
        marks.add(70);
        marks.add(93);
        System.out.println("Student Marks");
        for(Integer mark:marks){
            System.out.println(mark);
        }
    }
}
