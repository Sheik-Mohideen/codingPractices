package edu;

import java.util.Scanner;

public class Excep {
    public static void main(String[] args)
    {
        int a,b;
        a=8;
        try
        {
            b=a/0;
            System.out.println(a);
        }
            catch (Exception y)
            {
                System.out.println("h");
            }
        finally {
            System.out.println("No Error");
        }
    }
}


