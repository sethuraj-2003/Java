public class studentdemo_array {
    public static void main(String[] args) {
     String[] student = new String[3];
 
        student[0] = "Sri";
        student[1] = "Naveen";
        student[2] = "Kiruba";
       
        System.out.println("Student Lists");
        for( String students : student){
            System.out.println(students);
        }
    }   
    }
