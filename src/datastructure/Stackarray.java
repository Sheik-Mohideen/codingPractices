package datastructure;

public class Stackarray
{
    int stack[]=new int[5];
    int top=0;
    public void push(int data)
{ if(top==5) {
    System.out.println("stack is full");
}else {
    stack[top] = data;
    top++;
}
}

public int pop() {
    int data=0;

    if (isEmpty()) {
        System.out.println("stack is empty");

    } else {

        top--;
        data = stack[top];
        stack[top] = 0;

    }
    return data;
}
    public int peek()
    {
        int data=0;
        data=stack[top-1];
        return data;
    }
    public boolean isEmpty()
    {
        return top<=0;
    }
    public int size()
    {
        return top;
    }
public void show()
{
    for(int r:stack)
    {
        System.out.print(r+" ");
    }
}
}
