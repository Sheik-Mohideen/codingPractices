package datastructure.stack;
import java.util.Scanner;
class Node  {
    int data;
    Node next;
}
class Linkedlist  {
    Node head;Node n;
    int a;

    public void push(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;

        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void pop() {

        size();
        Node n = head;
        if(a==1)
            head=null;
        else{

            for (int i = 1; i < a - 1; i++) {
                n = n.next;
            }
            n.next = null;

        }
        show();
    }

    public int size() {
        Node n = head;
        if (head == null) {
            a = 0;
            return a;
        } else {a=0;
            while (n.next != null) {
                a=a+1;
                n = n.next;
            }
            a =a +1;
            return a;

        }
    } public void isEmpty(){

        if(head!=null)
        {
            System.out.println("Stack have Element");
        }
        else
        {
            System.out.println("Stack is Empty");
        }

    }

    public void show() {
        if (head==null) {
            System.out.println("The list is empty");
        } else {
            Node n = head;
            while (n.next != null) {
                System.out.print(n.data);
                n = n.next;
            }
            System.out.print(n.data+"\n");
        }
    }

}
public class Stacklinkedlist {
    public static void main(String[] args) {
        Linkedlist obj=new Linkedlist();
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
