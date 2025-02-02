import java.util.Scanner;
class PDemo010{
    String Customer_name = "Ashwitha";
    long ph = 123456790;
    double Balance = 10000.0;
    void accept_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur name and ph: ");
        Customer_name = sc.nextLine();
        ph = sc.nextLong();

    }
    void display_details(){
        System.out.println("customer name is "+Customer_name);
        System.out.println("customer ph no is "+ph);
        System.out.println("customer balance is "+Balance); 
    }
    public static void main(String[] args){
        PDemo010 obj = new PDemo010();
        obj.accept_details();
        obj.display_details();
    }
}