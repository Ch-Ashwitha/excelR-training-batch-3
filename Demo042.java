import java.util.Scanner;
public class Demo042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        char result = Character.toUpperCase(ch);
        System.out.println(result);
        sc.close();
    }
}