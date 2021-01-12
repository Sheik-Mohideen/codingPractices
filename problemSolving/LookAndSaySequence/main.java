/*
    Find the n’th term in Look-and-say (Or Count and Say) Sequence.
    The look-and-say sequence is the sequence of below integers:
    1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, …
* */
package problemSolving.LookAndSaySequence;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("1");
        }
        else if(n==2)
        {
            System.out.println("11");
        }
        else
        {
            int count=1;
            StringBuilder str=new StringBuilder();
            StringBuilder t=new StringBuilder();
            str.append(11);
            for(int j=0;j<n-2;j++)
            {
                int len=str.length();
                for(int i=0;i<len-1;i++)
                {
                    if(str.charAt(i)==str.charAt(i+1))
                    {
                        count++;
                    }
                    else
                    {
                        t.append(count);
                        t.append(str.charAt(i));
                        count=1;
                    }
                }
                if(str.charAt(len-1)==str.charAt(len-2))
                {
                    t.append(count);
                    t.append(str.charAt(len-1));
                }
                else
                {
                    t.append(count);
                    t.append(str.charAt(len-1));
                }
                str.delete(0,len);
                str.append(t);
                int len2=t.length();
                t.delete(0,len2);
                count=1;

            }
            System.out.println(str.toString());

        }
    }
}
