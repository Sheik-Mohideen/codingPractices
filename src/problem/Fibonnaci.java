import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args)
    {
      int i,d,b,r,a;b=1;a=0;
      Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
      r=s.nextInt();
      d=(r-2)/2;
      for(i=0;i<d;i++) {
          if (i == 0) {

              System.out.println(a);
              System.out.println(b);

          }
          a = a + b;
          System.out.println(a);
          b = a + b;
          System.out.println(b);
      }
        if(r%2!=0){
            a = a + b;
            System.out.println(a);
        }

    }
}
