#include<stdio.h>
#include<conio.h>
void main()
{
	int a[]={2,4,5,6,7,9,10,13};
	int b[]={2,3,4,5,6,7,8,9,11,15};
	int c[100];
	int m,n,i=0,j=0,k=0,z;
	clrscr();
	m=sizeof(a)/sizeof(a[0]);
	n=sizeof(b)/sizeof(b[0]);
	while((i<m)||(j<n))
	{
		if(i>=m)
		{
			c[k]=b[j];
			j++;
			k++;
		}
		else if(j>=n)
		{
			c[k]=a[i];
			i++;k++;
		}
		else if(a[i]!=b[j])
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;k++;
			}
			else
			{
				c[k]=b[j];
				j++;k++;
			}
		}
		else
		{
			c[k]=a[i];
			i++;
			j++;k++;
		}
	}
	for(z=0;z<k;z++)
	{
		printf("%d\n ",c[z]);
	}
}
