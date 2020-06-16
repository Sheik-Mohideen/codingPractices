package Algorithm;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        int i,k,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        k=s.nextInt();
        int a[]=new int[k];
        for(i=0;i<k;i++)
        {
            a[i]=s.nextInt();

        }
        for(i=0;i<k-1;i++)
        {
            for(j=0;j<k-1;j++)
            {
               if(a[j]>a[j+1])
               {
                   int t;
                   t=a[j];
                   a[j]=a[j+1];
                   a[j+1]=t;


               }
            }
        }
        for(i=0;i<k;i++)
        {
            System.out.println(a[i]);

        }

    }
}
