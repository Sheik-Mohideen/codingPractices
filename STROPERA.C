#include<stdio.h>
#include <conio.h>
#include <string.h>
void main()
{
	int i,n,m,j,temp=-1;
	char a[]="sheik7777";
	char b[]="7747";
	clrscr();
	n=strlen(a);
	m=strlen(b);
	for(i=0,j=0;(i<n)&&(j<m);i++)
	{
		if(a[i]==b[j])
		{
			if(j==0)
			{
				temp=i;
			}
			j++;
		}
		else
		{
			j=0;
			temp=-1;
		}
		if(j==m)
		{
			printf("The position is:%d",temp);
			break;
		}
	}
	if(j!=m)
	{temp=-1;
	printf("The position is:%d",temp);
	}
}