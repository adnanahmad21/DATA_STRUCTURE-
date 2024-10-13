
import java.util.Scanner;

public class palindrome {

    static int rev = 0;

    static void reverse(int n) {
        if (n == 0)
            return;
        rev = rev * 10 + n % 10;
        reverse(n / 10);

    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        // int ans = reverse(n,0);
        // System.out.println(ans);
        reverse(n);
        if(rev==n)
        System.out.println("palindrome no.");
        else System.out.println(" not a palindrome no.");

    }
}
