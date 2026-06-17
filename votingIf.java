import java.util.Scanner;

public class votingIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age:");
        int age = sc.nextInt();
        
        if (age>=18) {
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
