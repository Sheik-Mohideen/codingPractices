import java.lang.Math;

public class Sudoku {
    public static boolean issafe(int board[][],int row ,int coln,int num)
    {
        int N=(int) Math.sqrt(board.length);
        //check is safe in row
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==num)
            {
                return false;
            }
        }
        //check for column
        for(int i=0;i<9;i++)
        {
            if(board[i][coln]==num)
            {
                return false;
            }
        }
        //check the surrounded 9 blocks
        //N=Math.sqrt(length of the board) => N=3
        int startRow=N*(row/N);
        int startColn=N*(coln/N);
        for(int i=startRow;i<startRow+3;i++)
        {
            for(int j=startColn;j<startColn+3;j++)
            {
                if(board[i][j]==num)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean suduko(int board[][],int n)
    {
        int row= -1;
        int coln= -1;
        boolean isempty=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==0)
                {
                  row=i;
                  coln=j;
                  isempty=false;
                  break;
                }

            }
            if(!isempty)
            {
                break;
            }
        }
        if(isempty)
        {

            return true;
        }
        else
        {

            for(int num=1;num<=9;num++)
            {
                if(issafe(board,row,coln,num))
                {
                    board[row][coln]=num;
                    if(suduko(board,n))
                    {
                        return true;
                    }
                    else
                    {
                        board[row][coln]=0;
                    }


                }
            }
            return false;
        }

        }


    public static void show(int board[][],int n)
    {

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {

        int board [][]={ {1, 0 ,0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 2, 0, 0, 0, 0, 1, 0},
                {0 ,0 ,0 ,0 ,0 ,0 ,0, 0, 2},
                {0 ,0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0 ,0, 0, 7, 0, 6, 0, 0},
                {0, 0, 9, 0, 0, 2, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 7, 0, 0},
                {2, 0, 0, 6, 0, 0, 0, 4, 0}};
        int n=board.length;
        suduko(board,n);
        if(suduko(board,n))
        {
            show(board,n);
        }
        else
        {
        }

    }

}
