abstract class LibraryItem {
    protected int itemId;
    protected String itemName;
    private double price;

    public LibraryItem(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        setPrice(price);
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price");
        }
    }
    public void display() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
    }
    abstract void issueItem();
}

class Book extends LibraryItem {

    public Book(int itemId, String itemName, double price) {
        super(itemId, itemName, price);
    }

    @Override
    void issueItem() {
        System.out.println(itemName + " Book Issued Successfully");
    }
}

class Magazine extends LibraryItem {

    public Magazine(int itemId, String itemName, double price) {
        super(itemId, itemName, price);
    }

    @Override
    void issueItem() {
        System.out.println(itemName + " Magazine Issued Successfully");
    }
}

class Library {

    public void addItem() {
        System.out.println("No item details provided");
    }

    public void addItem(int itemId, String itemName) {
        System.out.println("Item Added");
        System.out.println("Item ID : " + itemId);
        System.out.println("Item Name : " + itemName);
    }

    public void addItem(int itemId, String itemName, double price) {
        System.out.println("Item Added");
        System.out.println("Item ID : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
    }

    public void searchItem(LibraryItem item, int searchId) {
        if (item.itemId == searchId) {
            System.out.println("Item Found");
            item.display();
        } else {
            System.out.println("Item Not Found");
        }
    }
}

 
public class libraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();
        library.addItem();
        library.addItem(100, "Digital System Design");
        library.addItem(101, "Communication Systems", 750.0);
        System.out.println("\n-----------------------------------");

         
        LibraryItem item;
        item = new Book(101, "Communication Systems", 750.0);
        item.display();
        item.issueItem();
        System.out.println("-----------------------------------");

        item = new Magazine(201, "Tech Monthly", 150.0);
        item.display();
        item.issueItem();
        System.out.println("-----------------------------------");

        // Search Item
        LibraryItem book = new Book(101, "Communication Systems", 750.0);
        library.searchItem(book, 101);
    }
}
