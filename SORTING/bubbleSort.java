import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

class bubbleSort {
    public static void main(String[] args) {
        int a[] = new int[11];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        Boolean x = false;
        for (int i = 0; i < a.length - 1; i++) {
            x = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    x = true;
                }
            }
            if (x != true)
                break;
        }
        System.out.println(Arrays.toString(a));

    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
// By RECURSION
// import java.util.Arrays;
// import java.util.*;
// class bs {
// static void bs(int a[],int i,int j){
// if(i==0){
// System.out.print(Arrays.toString(a));
// return;
// }

// if(j<i){
// if(a[j]>a[j+1]){
// int t=a[j];
// a[j]=a[j+1];
// a[j+1]=t;
// }
// bs(a,i,j+1);
// }
// else bs(a,i-1,0);
// }
// public static void main(String[] args) {
// int a[]=new int[11];
// Scanner sc = new Scanner(System.in);
// for (int i = 0; i < a.length; i++)
// a[i] = sc.nextInt();
// bs(a,a.length-1,0);
// }
// }