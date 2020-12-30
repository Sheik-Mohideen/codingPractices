package MergeSort;

import java.util.Scanner;

public class MergeSort {
    public void merge(int l,int m,int r,int a[])
    {
        int left[]=new int[m-l+1];
        int right[]=new int[r-m];
        int x=0,y=0;
        int z;
        for(int i=l;i<=m;i++)
        {
            left[x]=a[i];
            x++;
        }
        for(int j=m+1;j<=r;j++)
        {
            right[y]=a[j];
            y++;
        }
        x=0;y=0;z=l;
        while (x<left.length && y<right.length)
        {
            if(left[x] < right[y])
            {
                a[z]=left[x];
                x++;
            }
            else
            {
                a[z]=right[y];
                y++;
            }
            z++;
        }
        while (x<left.length)
        {
            a[z]=left[x];
            x++;
            z++;
        }
        while (y<right.length)
        {
            a[z]=right[y];
            y++;
            z++;
        }
    }
    public void sort(int l,int r,int a[])
    {
     if(l<r)
     {   int m=(r+l)/2;
         sort(l,m,a);
         sort(m+1,r,a);
         merge(l,m,r,a);
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
        System.out.println("Enter number of element");
        int count=sc.nextInt();
        sc.nextLine();
        int a[] =new int[count];
        for(int i=0;i<count;i++)
        {
            a[i]=sc.nextInt();
        }
        MergeSort obj = new MergeSort();
        obj.sort(0,a.length-1,a);
        obj.print(a);
    }
}