package datastructure;

public class Stacklinkedlist  {
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