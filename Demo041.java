import java.util.Scanner;
public class Demo041 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character: ");
    char ch = sc.next().toLowerCase().charAt(0);
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        System.out.println("Entered character is vowel");
    }else if ((ch >= 'a' && ch <= 'z')){
        System.out.println("Entered character is consonent");
    }else {
        System.out.println("please enter a alphabet");
    }
    }
}