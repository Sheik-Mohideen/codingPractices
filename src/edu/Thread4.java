package edu;
//priority
//name
//alive
//join
//one more topic "synchronization"
public class Thread4{
    public static void main(String[] args)throws Exception {
        hi1 obj1=new hi1();
        hello1 obj2=new hello1();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.setName("hi thread");
        t2.setName("hello thread");
        System.out.println( t1.getName());
        System.out.println(t2.getName());
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        System.out.println(t1.isAlive());
        try { Thread.sleep(10);}catch (Exception e){}
        t2.start();
        System.out.println(t2.isAlive());
        t1.join();
        t2.join();
        System.out.println("thread finish");

    }
}