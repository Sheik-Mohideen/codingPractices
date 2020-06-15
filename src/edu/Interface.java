package edu;
interface A
    {
        void show();
      default  void fun()
        {
            System.out.println("1");
        }
        default void display()
        {
            System.out.println("2");
        }
    }
  class B implements A
    {
        public void show()
        {
            System.out.println("anything");

        }

    }
    public class Interface
    {
        public static void main(String[] args) {
            A s=()-> System.out.println("changed");
            s.show();
            s.display();
        }

        }



