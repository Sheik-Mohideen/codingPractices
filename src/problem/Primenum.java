import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        int i,a,count;
        count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        a=s.nextInt();
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;System.out.println(i);
            }
        }
        if(count==2)
        {
            System.out.println("Is Prime number");
        }
        else
        {
            System.out.println("Is not Prime number");
        }
    }
}
