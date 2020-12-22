package Algorithm;

import java.util.Scanner;

public class Palindromenum {
    public static void main(String[] args) {
        int a,i,d,z;String k;
        int count=0;
         Scanner s=new Scanner(System.in);
        System.out.println("Enter");
        a=s.nextInt();
        k=Integer.toString(a);
        StringBuffer st=new StringBuffer(k);
        d=st.length();
        z=d;
       char b[]=new char[d];

        if(d%2==0)
        {
            System.out.println("Not a Palindrome");
        }
        else
        {
            for(i=0;i<d;i++)
            {
                b[i]=Integer.toString(a).charAt(i);
            }
            for(i=0;i<d/2;i++)
            {
                if(b[i]==b[z-1])
                {
                    count++;
                }
                z--;
            }
            if(count==d/2)
            {
                System.out.println("Is a Palindome");
            }
            else
            {
                System.out.println("Not a Palindrome");
            }

        }
   }
}
