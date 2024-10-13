import java.util.*;

public class factorial {
    static int fact(int n) {
        if(n==1 || n==0) return 1;
        return n * fact(n - 1);
    }
    static int sum(int n ){
        if(n==1 ) return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("factorial of " + n + " = " + fact(n));
        System.out.println("sum of " + n + " = " + sum(n));

    }
}
