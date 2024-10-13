class binarysearch {

    static boolean search(int a[], int target, int low, int high) {
        if (low > high)
            return false;
        int mid = (low + high) / 2;
        if (target == a[mid]) {
            return true;
        } else if (target < a[mid])
            return search(a, target, low, mid - 1);
        else
            return search(a, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int a[] = { 0, 2, 4, 5, 8, 11, 13, 14, 19, 20, 22, 1001, 1002, 1003 };
        boolean x = search(a, 124, 0, a.length - 1);
        if (x)
            System.out.println("Element is present");
        else
            System.out.println("Element is  not present");
    }
}