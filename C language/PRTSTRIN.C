/* Input "a1b10"
 Output abbbbbbbbbb*/
 #include <stdio.h>
 #include<conio.h>
 #include<string.h>
 #include<stdlib.h>
void main()
 {     	char str[]="a1h98j90";
       //	char str[100];
	int i=0;
	int j;
	int c=0;
	int count=0;
	clrscr();
       //	scanf("%s",&str);
       while(i<strlen(str))
       {
	 if(str[i]>='a'&&str[i]<='z')
	 {
		char temp=str[i];
		for(i=i+1;i<strlen(str);i++)
		{
			if(str[i]>='0'&&str[i]<='9')
			{
				c=(c*10)+(str[i]-'0');
				count++;
			}
			else
			{
			break;
			}
		}
		for(j=0;j<c;j++)
		{	printf("%c",temp);
		}

		c=NULL;
		count=0;
	 }
       }

 getch();
 }