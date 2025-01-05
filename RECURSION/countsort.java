import java.util.Arrays;

public class countsort {
    static int[] sort(int a[]) {
        int max = -1;
        for (var x : a)
            max = Math.max(x, max);
        int frq[] = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            frq[a[i]] = frq[a[i]] + 1;
        }
        for (int i = 1; i < frq.length; i++) {
            frq[i] = frq[i - 1] + frq[i];

        }
        int b[] = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            int x = frq[a[i]]--;
            b[x - 1] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = { 50, 4, 6, 2, 1, 17, 30, };
        System.out.println("before sort" + Arrays.toString(a));
        int b[] = sort(a);
        System.out.println("After sort" + Arrays.toString(b));
    }
}
