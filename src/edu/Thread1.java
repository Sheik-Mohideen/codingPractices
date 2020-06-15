package edu;

public class Thread1 {
    public static void main(String[] args) {
        hi obj1=new hi();
        hello obj2=new hello();
        obj1.start();
        try { Thread.sleep(10);}catch (Exception e){}

        obj2.start();
    }
}
class hi extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hi");
            try { Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

class hello extends Thread
{
    public  void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hello");
            try { Thread.sleep(1000);}catch (Exception e){}
        }
    }
}