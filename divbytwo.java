import java.util.Scanner;

public class divbytwo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Value:");
       int value = sc.nextInt();
       if (value%2==0) {
        System.out.println("Even");
       }
       else{
        System.out.println("odd");
       }
       sc.close();

    }
}
