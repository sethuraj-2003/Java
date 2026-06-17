public class multiplecatch {
    public static void main(String[] args) {
        try{
            int salary = Integer.parseInt("ABC");
            int arr[]= new int[3];
            System.out.println(arr[5]);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Salary Format");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }
        
    }
}
