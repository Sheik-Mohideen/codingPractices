package datastructure;

import java.util.Scanner;
class Node  {
    int data;
    Node next;
}
class List {
    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
       node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n;
            n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void show() {
        Node n;
        n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);

    }

    public void add(int a, int data) {
        Node node = new Node();
        node.data = data;
        if (a == 0) {
            node.next = head;
            head = node;
        } else {
            Node n = head;
            for (int i = 1; i < a - 1; i++) {
                n = n.next;

            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void delete(int a) {
        Node n = head;
        Node n1;
        for (int i = 1; i < a - 1; i++) {
            n = n.next;

        }
        n1 = n.next;
        n.next = n1.next;
    }

    public void search(int a) {
        int count = 1;
        int b = 0;
        Node n;
        n = head;
        if (n.data != a) {
            n = n.next;
            count++;
            if (n.next == null)
                b = 1;
        }
        if (b == 1)
            System.out.println("Cannot find the element");
        else
            System.out.println(count);

    }

}

public class Linkedlist {
    public static void main(String[] args) {
        List list = new List();
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
