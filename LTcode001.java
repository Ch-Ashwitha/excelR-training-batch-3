import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
        }
}
public class LTcode001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(x);
        System.out.println(result);

    }
}