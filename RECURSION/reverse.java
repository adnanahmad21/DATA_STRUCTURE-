import java.util.Scanner;

public class reverse {
    static int rev = 0;

    static void reverse(int n) {
        if (n == 0)
            return;
        rev = rev * 10 + n % 10;
        reverse(n / 10);

    }
    // static int reverse(int n,int i) {
    // if (n == 0)
    // return 0;
    // return n%10*(int)(Math.pow(10, i))+reverse(n/10, ++i);

    // }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        // int ans = reverse(n,0);
        // System.out.println(ans);
        System.out.println("reverse of " + n + " = " + rev);

    }
}
