import java.util.*;

public class sumOfdigi {
static int sum(int n){
    if(n==0) return 0;
    return n%10+sum(n/10);
}
static int prod(int n){
    
    if(n==0) return 1;
    if(n%10==0) return 0;
    return n%10*prod(n/10);
}
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("sum of " + n + " = " + sum(n));
        System.out.println("product of " + n + " = " + prod(n));

    }
}
