

public class generics {
    public static void main(String[] args) {
        Integer a[] = { 1, 2, 3, 4, 5 };
        String ar[] = { "vg", "wi", "h", "iwf", "aifh" };
        printArray(a);
        printArray(ar);
    }

    static <T> void printArray(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

