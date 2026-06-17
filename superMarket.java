import java.util.Scanner;

public class superMarket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- SUPERMARKET BILL ---");

        System.out.print("Enter Your Name:");
        String customername = sc.nextLine();

        System.out.print("Enter Product Name:");
        String productname = sc.nextLine();

        System.out.print("Enter Price:");
        int price = sc.nextInt();

        System.out.print("Enter The Number of Quantity:");
        int quantity = sc.nextInt();

        int total = price * quantity;

        int discount = 0;

        if (total >= 5000) {
            discount = total * 20 / 100;
        } 
        else if (total >= 3000) {
            discount = total * 10 / 100;
        }

        int finalAmount = total - discount;

        System.out.println("--- SUPERMARKET BILL ---");
        System.out.println("Customer Name : " + customername);
        System.out.println("Product Name  : " + productname);
        System.out.println("Price         : " + price);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Total Amount  : " + total);
        System.out.println("Discount      : " + discount);
        System.out.println("Final Amount  : " + finalAmount);

        sc.close();
    }
}

