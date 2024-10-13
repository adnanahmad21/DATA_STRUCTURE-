import java.util.*;

class PrintNto1 {
    static void print(int n) {
        if (n < 1)
            return;
        System.err.print(n + " ");
        print(n - 1);
    }

    // 1toN
    static void print2(int n) {
        if (n < 1)
            return;
        print2(n - 1);
        System.err.print(n + " ");
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        print(n);
        System.out.println();
        print2(n);

    }
}