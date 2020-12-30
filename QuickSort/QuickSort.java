package QuickSort;

import java.util.Scanner;

public class QuickSort {
    public  int partition(int start,int end,int a[])
    {   int pIndex=start;
        int i;
        int pivot=a[end];
        for(i=start;i<=end-1;i++)
        {
            if(a[i]<pivot)
            {   int t;
                t=a[pIndex];
                a[pIndex]=a[i];
                a[i]=t;
                pIndex++;
            }
        }
        int t;
        t=a[end];
        a[end]=a[pIndex];
        a[pIndex]=t;
        return pIndex;
    }
    public void sort(int start,int end,int a[])
    {
        if(start<end)
        {   int pIndex;
            pIndex=partition(start,end,a);
            sort(start,pIndex-1,a);
            sort(pIndex+1,end,a);
        }
    }
    public void print(int a[])
    {
        for(int e:a)
        {
            System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int count=sc.nextInt();
        sc.nextLine();
        int a[]=new int[count];
        System.out.println("Enter the element");
        for (int i=0;i<count;i++)
        {
            a[i]=sc.nextInt();
        }
        QuickSort obj=new QuickSort();
        int len=a.length-1;
        obj.sort(0,len,a);
        obj.print(a);
    }
}
