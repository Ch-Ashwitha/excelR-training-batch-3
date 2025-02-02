import java.util.Scanner;
class Demo058{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num % i == 0){
            System.out.println("Factors of "+num+" is "+i);
        }
        }
    }
}