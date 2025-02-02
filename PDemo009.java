import java.util.Scanner;
class PDemo009{
    String name = "Ashwitha";
    int age = 19;
    String branch = "CSE";
    public void details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String entered_name = sc.next();
        System.out.println("Enter your age: ");
        int entered_age = sc.nextInt();
        if (entered_name.equals(name) && entered_age == age) {
            System.out.println("Your name is: "+ name);
            System.out.println("Your age is: "+age);
            System.out.println("You belong to: "+branch);
        }else{
        System.out.println("PLZ ENTER VALID NAME AND AGE");
    }
    }
    public static void main(String[] args) {
        PDemo009 obj = new PDemo009();
        obj.details();
    }

}