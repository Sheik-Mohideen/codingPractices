package Algorithm;

import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
        int i, n, j, r,t;
        Scanner s = new Scanner(System.in);
        System.out.println("Number of Elements");
        n = s.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
                for(i=0;i<n;i++)
                {
                    if(a[i]>a[i+1])
                    {
                        t=a[i];
                        a[i]=a[i+1];
                        a[i+1]=t;

                    }
                    for(j=0;j<i+1;j++)
                    {
                        if(a[j]>a[j+1])
                        {
                            r=a[j];
                            a[j]=a[j+1];
                            a[j+1]=r;

                        }
                    }
                }
                for(i=0;i<n;i++)
                {
                    System.out.println(a[i]);
                }

    }
}