package edu;

public class Thread2{
    public static void main(String[] args) {
        hi1 obj1=new hi1();
        hello1 obj2=new hello1();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        try { Thread.sleep(10);}catch (Exception e){}
        t2.start();
    }
}
class hi1 implements Runnable
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

class hello1 implements Runnable
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