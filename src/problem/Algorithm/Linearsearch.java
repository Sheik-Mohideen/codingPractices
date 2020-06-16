package Algorithm;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        int i, n, r, t;t=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Number of Elements");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Elenents are");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the search element");
        r=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(r==a[i])
            {
                t=i+1;
                break;
            }
        }
        System.out.println(t);
    }

}