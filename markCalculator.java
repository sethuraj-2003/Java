import java.util.Scanner;
public class markCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---STUDENT REPORT---");
        System.out.print("Enter Student ID:");
        int studentid = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Student Name:");
        String studentname = sc.nextLine();
        
        System.out.print("Enter Your Subject 1 Marks:");
        int sub1=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Your Subject 2 Marks:");
        int sub2=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Your Subject 3 Marks:");
        int sub3=sc.nextInt();
        sc.nextLine();
        System.out.println("---STUDENT REPORT---");
        System.out.println("Student ID:"+studentid);
        System.out.println("Student Name:"+studentname);
        int total = sub1+sub2+sub3;
        System.out.println("Total: "+total);
        double avg = total/3;
        System.out.println("Average: "+avg);

        if(avg>=90){
            System.out.println("Grade: A");
        }
        else if(avg>=75){
            System.out.println("Grade: B");
        }
        else if(avg>=50){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: D");
        } 
        
        if(sub1 >=35  && sub2 >=35 && sub3 >=35){
        System.out.println("Result:PASS");
        }
        else{
            System.out.println("Result:Fail");
        }

    sc.close();
    }
    }

