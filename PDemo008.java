import java.util.Scanner;
class PDemo008{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = "Ashwitha";
        String pwd = "Ashu123";

        do{
            System.out.println("plz enter your name: ");
            String enteredname = sc.next();
            System.out.println("plz enter pwd: ");
            String enteredpwd = sc.next();
            if(enteredname.equals(name) && enteredpwd.equals(pwd)) {
            System.out.println("Welcome!!");
            System.out.println("Have a nice day");
            System.out.println("Login Successful");
            break;
            }
            else{
                System.out.println("entered login credentials are wrong");
            }
        }while(true);
    }
}