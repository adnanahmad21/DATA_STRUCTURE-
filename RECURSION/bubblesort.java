import java.util.Arrays;

public class bubblesort {
    static void sort(int a[], int i, int j) {
        if (i == a.length) {
            return;
        }
        if (j < a.length - i - 1) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
            sort(a, i, j + 1);
        } else {
            sort(a, i + 1, 0);
        }

    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 3, 2, 1, 0, -1, -1, -2, -3, -4 };
        System.out.println("before sort" + Arrays.toString(a));
        sort(a, 0, 0);
        System.out.println("After sort" + Arrays.toString(a));
    }
}
