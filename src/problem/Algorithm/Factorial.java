package Algorithm;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a,i;double sum=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the factorial value");
        a=s.nextInt();
        for (i=1;i<=a;i++)
        {
            sum=sum*i;
        }
        System.out.println("The factorial of "+a+"is "+sum);
    }
}
