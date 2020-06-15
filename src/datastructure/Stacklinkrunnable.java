package datastructure;

import java.util.Scanner;

public class Stacklinkrunnable   {
    public static void main(String[] args) {
        Stacklinkedlist obj=new Stacklinkedlist();
        Scanner sc=new Scanner(System.in);
        char y; int i,data,b,n;
        do {
            System.out.println("1.Add the element in stack\n2.Show the elenent in the stack\n3.Delete the element from the stack\n4.Find the size of stack\n5.Check the stack is empty");
            n=sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("How many element like insert in stack");
                    b=sc.nextInt();
                    System.out.println("Enter the element you want to insert");

                    for(i=0;i<b;i++)
                    {data=sc.nextInt();
                        obj.push(data);
                    }break;
                case 2:
                    obj.show();break;
                case 3:
                    obj.pop();break;
                case 4:
                    System.out.println(obj.size());break;
                case 5:
                    obj.isEmpty();break;
            }
            System.out.println("Are you want to continue say(y/n)");
            y=sc.next().charAt(0);
        }while (y=='y');


    }
}
