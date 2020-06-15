package datastructure;

import java.util.Scanner;

public class Runnable {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        int n;
        char y;
        Scanner s = new Scanner(System.in);
        do
        {
            System.out.println("1.Add the element in the list\n2.show\n3.Add the element in given position\n4.delete\n5.search ");
            n = s.nextInt();

            switch (n) {
                case 1:
                    int data, m;
                    System.out.println("Enter how many data you entered");
                    m = s.nextInt();
                    for (int i = 0; i < m; i++) {
                        data = s.nextInt();
                        list.add(data);

                    }break;
                case 2:
                    list.show();break;
                case 3:

                    System.out.println("enter the position to insert the element");
                    m = s.nextInt();
                    System.out.println("enter the element");
                    data = s.nextInt();
                    list.add(m, data);break;


                case 4:
                    System.out.println("Which position element can be delete");
                    data=s.nextInt();
                    list.delete(data);break;
                case 5:
                    System.out.println("Search the element position");
                    data=s.nextInt();
                    list.search(data);break;
            }
            System.out.println("Do you want to continue(y/n)");
            y=s.next().charAt(0);
        }while( y=='y');
    }
}