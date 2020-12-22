package datastructure.stack;

import java.util.Scanner;

class Array {
    int top = 0; int m;
    int stack[]=new int[1000];

    public void push(int data) {
        if (top == 1000) {
            System.out.println("stack is full");
            return;
        } else {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {
        int data = 0;

        if (isEmpty()) {
            System.out.println("stack is empty");

        } else {

            top--;
            data = stack[top];
            stack[top] = 0;

        }
        return data;
    }

    public int peek() {
        int data = 0;
        data = stack[top - 1];
        return data;
    }

    public boolean isEmpty()
    {
        return top <= 0;
    }

    public int size()
    {
        return top;
    }

    public void show() {
       for(int i=0;i<top;i++)
       {
           System.out.print(stack[i]+" ");
       }
    }
}

public class Stackarray {
    public static void main(String[] args) {
        int n;
        char y;
        Scanner s=new Scanner(System.in);
        Array list = new Array();

        do
        {
            System.out.println("1.Push the element in the stack\n" +
                    "2.show\n3.POp the element in the stack\n" +
                    "4.Find the stack is empty or not\n" +
                    "5.Peek the stack\n6.Find the size of the stack ");
            n = s.nextInt();

            switch (n) {
                case 1:
                    int data,t;
                    System.out.println("Enter how many data you entered");
                    t = s.nextInt();
                    int r=list.size();
                    if(t>1000-r)
                    {
                        System.out.println("Enter the size below "+(1000-r));
                        break;
                    }
                    System.out.println("Emter the value");
                    for (int i = 0; i < t; i++) {
                        data = s.nextInt();
                        list.push(data);

                    }break;
                case 2:
                    list.show();break;

                case 3:

                    list.pop();break;
                case 4:
                    boolean empty=list.isEmpty();
                    if(empty)
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    System.out.println("The value on the top of the stack is:"+list.peek());
                    break;
                case 6:
                    System.out.println("The size of the stack is:"+list.size());
                    break;
            }
            System.out.println("Do you want to continue(y/n)");
            y=s.next().charAt(0);
        }while( y=='y');

    }
}
