import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        int min;

        int a[] = { 4, 3, 2, 1, -9, -65, -87, 50, -97 };
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < a.length; i++)
        // a[i] = sc.nextInt();

        // for (int i = 0; i < a.length - 1; i++) {
        // min = i;
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[j] < a[min])
        // min = j;
        // }
        // if (min != i)
        // swap(a, i, min);
        // }
        
        selectionSort1(a, a.length, 1, 0);
        System.out.println(Arrays.toString(a));
    }

    static void selectionSort1(int a[], int i, int j, int max) {
        if (i == 0)
            return;
        if (j < i) {
            if (a[j] > a[max])
                selectionSort1(a, i, j + 1, j);
            else
                selectionSort1(a, i, j + 1, max);
        } else {
            int temp = a[i-1 ];
            a[i -1] = a[max];
            a[max] = temp;
            i=i-1;
            selectionSort1(a, i , 1, 0);
        }
    }

    // static void swap(int a[], int i, int min) {
    //     int temp = a[i];
    //     a[i] = a[min];
    //     a[min] = temp;
    // }
}