/*
Question:
    An architect prepares the map of kingdoms. He maps the kingdom in the form of an M X N grid.
    The kingdom consist of various island. The kingdom declares the island with the largest
    area as the capital of the kingdom. A land is represented as the cluster of the horizontal
    and vertical adjacent cells consists of 1 is recognized as an island.
    Diagonally placed cells with value 1 do not belong to the same island.
    The area of the island is the number of 1's it spans.
    Write an algorithm to find the area of the island which is declared as the capital of kingdom.

    Input:
        1.Two lines separated by space is M X N matrix
        2.Matrix with 1's and 0's
        3. 0 -> is water 1->land
    case 1:
        input:
            4 4

            1 0 1 1
            0 0 1 0
            1 0 1 1
            1 0 1 1
        output:
            7

    case 2:
         input:
            4 4

            1 1 0 0
            0 1 0 0
            0 0 1 1
            0 0 1 1
        output:
            4

    case 3:
         input:
            5 6

            0 0 0 0 1 1
            0 1 1 0 0 1
            0 0 0 0 0 1
            0 0 1 1 0 1
            0 0 1 0 0 0

        output:
            5
*/
#include <stdio.h>
#include <stdlib.h>
int i=0,j=0,M,N,count=0;
void island(int i,int j,int a[M][N])
{
    count++;
    //Right
    if(j<N-1)
    {
        a[i][j]=2;
        if(a[i][j+1]==1)
        {
            island(i,j+1,a);

        }

    }
    //Down
    if(i<M-1)
    {
        a[i][j]=2;
        if(a[i+1][j]==1)
        {

            island(i+1,j,a);
        }
    }
    //Left
    if(j>0)
    {
        a[i][j]=2;
        if(a[i][j-1]==1)
        {
            island(i,j-1,a);
        }
    }
    if(i>0)
    {
        a[i][j]=2;
        if(a[i-1][j]==1)
        {
            island(i-1,j,a);
        }
    }

    return;
}
int main()
{
    printf("Enter the rows and column separate by space \n");
    scanf("%d %d",&M,&N);
    int capital=0;
     int a[M][N];
     /*int a[5][6]={{0,0,0,0,0,1},
                  {0,0,0,0,1,0},
                  {0,0,0,1,0,0},
                  {0,0,1,0,0,0},
                  {0,1,0,0,0,0}
           };
  */for(int i=0;i<M;i++)
    {
        for(int j=0;j<N;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }

    for(i=0;i<M;i++)
    {
        for(j=0;j<N;j++)
        {
            if(a[i][j]==1)
            {
                island(i,j,a);
                if(count > capital)
                {
                    capital=count;
                }
                count=0;
            }
        }
    }
    printf("The capital land have the Area of: %d",capital);

    return 0;
}
