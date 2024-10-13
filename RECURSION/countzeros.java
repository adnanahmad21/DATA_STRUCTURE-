public class countzeros {
    static int count(int n, int count) {
        if (n == 0)
            return count;
        if (n % 10 == 0)
            ++count;
        return count(n / 10, count);
    }

    static int c = 0;

    static int count(int n) {
        if (n == 0)
            return c;
        if (n % 10 == 0)
            ++c;
        return count(n / 10);
    }

    public static void main(String[] args) {
        // System.out.println(count(400,0));
        System.out.println(count(410200));
    }
}
