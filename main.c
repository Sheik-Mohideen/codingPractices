#include <stdio.h>
#include <stdlib.h>

void merge(int a[],int l,int m,int r)
{
    int n1=m-l+1;
    int n2=r-m;
    int L[n1];
    int R[n2];
    int i,j;
    for(i=0;i<n1;i++)
    {
        L[i]=a[l+i];

    }
    for(j=0;j<n2;j++)
    {

        R[j]=a[m+1+j];
    }
     i=0;
     j=0;
     int k=l;
    while(i<n1&&j<n2)
    {

        if(L[i]<R[j])
        {

            a[k]=L[i];
            i++;
        }
        else
        {
            a[k]=R[j];
            j++;
        }
        k++;
    }
    while(i<n1)
    {

        a[k]=L[i];
        i++;
        k++;

    }
    while(j<n2)
    {

        a[k]=R[j];
        j++;
        k++;
    }


}
void sort(int a[],int l,int r)
{
    if(l<r)
    {
    int m=(l+r)/2;
    sort(a,l,m);
    sort(a,m+1,r);
    merge(a,l,m,r);
    }

}
void view(int a[],int n)
{

    int i;
    for(i=0;i<n;i++)
    {

        printf("%d ",a[i]);
    }
}
int main()
{   printf("Enter the number of element");
    int n,i;
    scanf("%d",&n);
    int a[n];
    printf("Enter the element for sorting");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    //int n=sizeof(a)/sizeof(a[0]);
    sort(a,0,n-1);
    view(a,n);
    return 0;
}
