import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        int balance = 20000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Withdrawal amount:");
        int withdraw = sc.nextInt();
    
        if (withdraw<=balance) {
            System.out.println("Withdrawal sucessful");
        }
        else{
            System.out.println("Insuffcient balance");
        }
        sc.close();
    }
    
}
