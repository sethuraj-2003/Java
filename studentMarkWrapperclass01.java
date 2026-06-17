import java.util.ArrayList;

public class studentMarkWrapperclass01 {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(90);
        marks.add(95);
        marks.add(80);
        marks.add(70);
        marks.add(93);
        int total = 0;

        for(Integer mark:marks){
            total=total+mark;
        }
        double average=(double) total/marks.size();
        System.out.println("Total Marks :"+total);
        System.out.println("Average Marks :"+average);
    }
}
    
