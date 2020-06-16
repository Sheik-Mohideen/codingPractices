package Algorithm;

import java.util.Scanner;

public class Amstrong
{
    public static void main(String[] args) {
        int c,sum,f,z;
        String k;f=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        sum=s.nextInt();
        z=sum;
        while(sum>0)
        {
            c=sum%10;
            f=(c*c*c)+f;
            sum=sum/10;c=0;
        }
        if(z==f)
            System.out.println("It is Armstrong");
        else
            System.out.println("Not a Armstrong");
    }
}
