package datastructure;

public class Linkedlist {
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
        while (n.next!= null) {
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
        int b=0;
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

    //annonyms class
    //lambda expression
    public static class Thread3{
        public static void main(String[] args) {
            Thread t1=new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                }
            });
            Thread t2=new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            });
            t1.start();
            try { Thread.sleep(10);}catch (Exception e){}
            t2.start();
        }
    }
}

