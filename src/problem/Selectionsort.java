package problem;

import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element");
        int i;
        for(i = 0; i < n; ++i) {
            a[i] = s.nextInt();
        }

        for(int j = 0; j < n; ++j) {
            for(i = 0; i < n; ++i) {
                if (a[j] < a[i]) {
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }

        for(i = 0; i < n; ++i) {
            System.out.println(a[i]);
        }

    }

}


