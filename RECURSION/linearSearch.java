import java.util.ArrayList;

public class linearSearch {
    // static boolean search(int a[], int target, int i) {
    // if (i == a.length)
    // return false;
    // if (a[i]==target)
    // return true;
    // return search(a, target, i+1);
    // }
    static ArrayList<Integer> search(int a[], int target, int i) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (i == a.length) {
            return arr;
        }

        if (a[i] == target)
            arr.add(i);
            ArrayList<Integer> ar = search(a, target, i + 1);
            arr.addAll(ar);
            return arr;

    }

    public static void main(String[] args) {
        int maksad = 50;
        int a[] = { 1, 20, 30, 3, 4, 50, 6, 7, 8, 9, 50, 26, 24, 24, 50 };
        System.out.println(search(a, maksad, 0));
        // if (search(a, maksad, 0))
        // System.out.println("element is present in Array");
        // else
        // System.out.println("element is not present in Array");
        // }
    }
}
