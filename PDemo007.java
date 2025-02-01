import java.util.Scanner;
class PDemo007{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name,rollno and branch: ");
        String name = sc.next();
        int rollno = sc.nextInt();
        String branch = sc.next();
        System.out.println("Student name is "+name+" bearing roll no "+rollno+" belongs to "+branch+" Branch");
    }
}