#include <stdio.h>
#include <stdlib.h>
int d_row,d_coln,n,m,x=0,y=0;
int findPath(int a[m][n],int s_row,int s_coln,int row[],int coln[])
{   if((s_row>=m)|| (s_coln>=n))
    {
        printf("Invalid Position\n %d %d",s_row,s_coln);
        return 0;
    }
    if((s_row==d_row)&&(s_coln==d_coln))
        {
            a[s_row][s_coln]=2;
            row[x]=s_row;
            coln[y]=s_coln;
            return 1;
        }
    //Right
    if(s_coln<m-1)
    {
        if(a[s_row][s_coln+1]==1)
        {
            a[s_row][s_coln]=2;
            row[x]=s_row;x++;
            coln[y]=s_coln;y++;
            if(findPath(a,s_row,s_coln+1,row,coln)==0)
            {
                    a[s_row][s_coln]=1;
                    x--;
                    y--;
            }
            else{
                return 1;
            }
        }

    }
    //Top
    if(s_row>=0)
    {
        if(a[s_row-1][s_coln]==1)
        {
            a[s_row][s_coln]=2;
            row[x]=s_row;x++;
            coln[y]=s_coln;y++;
            if(findPath(a,s_row-1,s_coln,row,coln)==0)
            {
                    a[s_row][s_coln]=1;
                    x--;
                    y--;
            }
            else{
                return 1;
            }
        }

    }
    //Down
    if(s_row<n-1)
    {
        if(a[s_row+1][s_coln]==1)
        {
            a[s_row][s_coln]=2;
            row[x]=s_row;x++;
            coln[y]=s_coln;y++;
            if(findPath(a,s_row+1,s_coln,row,coln)==0)
            {
                    a[s_row][s_coln]=1;
                    x--;
                    y--;
            }
             else{
                return 1;
            }
        }

    }
    //Left
     if(s_coln>=0)
    {
        if(a[s_row][s_coln-1]==1)
        {
            a[s_row][s_coln]=2;
            row[x]=s_row;x++;
            coln[y]=s_coln;y++;
            if(findPath(a,s_row,s_coln-1,row,coln)==0)
            {
                    a[s_row][s_coln]=1;
                    x--;
                    y--;
            } else{
                return 1;
            }
        }

    }


    return 0;
}
int main()
{
    int i,j,s_row,s_coln;
    printf("Enter the Number of Row");
    scanf("%d",&m);
    printf("Enter the Number of Column");
    scanf("%d",&n);
    printf("Enter the Source location Row");
    scanf("%d",&s_row);
    printf("Enter the Source location Column");
    scanf("%d",&s_coln);
    printf("Enter the Destination location Row");
    scanf("%d",&d_row);
    printf("Enter the Destination location Column");
    scanf("%d",&d_coln);
    int row[m];
    int coln[n];
   /*
    int a[5][5]={{1,0,1,1,1},
                {1,1,0,1,1},
                {1,1,1,0,1},
                {1,1,1,1,1},
                {1,0,1,0,1}
    };*/
    int a[m][n];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
           scanf("%d",&a[i][j]);
        }

    }
    if(findPath(a,s_row,s_coln,row,coln))
    {
        printf("Path found\n");
    }
    else{
        printf("Path not exist\n");
    }

    for(int i=0;i<=x;i++)
    {
        printf("(%d,%d)",row[i],coln[i]);
        if(i!=x)
        {
            printf(" ->");
        }
    }
   /* printf("\n");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
           printf("%d ",a[i][j]);
        }
        printf("\n");
    }
*/
    return 0;
}
